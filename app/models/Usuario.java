package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.ConstraintViolation;

import play.data.validation.Constraints.Required;
import play.data.validation.Validation;
import play.db.ebean.Model;

import com.fasterxml.jackson.databind.JsonNode;

import functions.Funciones;

@SuppressWarnings("serial")
@Entity
public class Usuario extends Model {

	@Id
	public Long id;
	@Required
	public String nombre;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "autor")
	public List<Tarea> tareas;

	private static Integer LIMIT = Funciones.LIMIT;
	public static Finder<Long, Usuario> finder = new Finder<Long, Usuario>(
			Long.class, Usuario.class);

	public Usuario(JsonNode input) {
		super();
		if (input.hasNonNull("nombre")) {
			this.nombre = input.get("nombre").asText();
		}
	}

	/**
	 * Buscar usuario por ID
	 * @param id
	 * @return
	 */
	public static Usuario findById(Long id) {
		return finder.byId(id);
	}

	/**
	 * Buscar usuario por Nombre
	 * @param nombre
	 * @return
	 */
	public static Usuario findName(String nombre) {
		return finder.where().eq("nombre", nombre).findUnique();
	}

	/**
	 * Buscar usuarios por Nombre paginados
	 * @param nombre
	 * @param pagina
	 * @return
	 */
	public static List<Usuario> findNames(String nombre, Integer pagina) {
		return finder.where().like("nombre", "%" + nombre + "%").setMaxRows(10)
				.setFirstRow(pagina * 10).findList();
	}

	/**
	 * Buscar usuarios paginados
	 * @param page
	 * @return
	 */
	public static List<Usuario> getAll(Integer page) {
		return finder.setMaxRows(LIMIT).setFirstRow((page - 1) * LIMIT)
				.findList();
	}

	public boolean changeData(Usuario newData) {
		boolean changed = false;

		if (newData.nombre != null) {
			this.nombre = newData.nombre;
			changed = true;
		}

		return changed;
	}

	public List<String> directValidate() {
		Set<ConstraintViolation<Usuario>> violations = Validation
				.getValidator().validate(this);
		List<String> errors = new ArrayList<String>();
		for (ConstraintViolation<Usuario> cv : violations) {
			errors.add(cv.getMessage());
		}
		String violation = this.validate();
		if (violation != null) {
			errors.add(violation);
		}
		return errors;
	}

	public String validate() {
		return null;
	}

	public List<String> validateAndSave() {
		List<String> errors = directValidate();
		if (errors.size() == 0) {
			this.save();
		}
		return errors;
	}
}
