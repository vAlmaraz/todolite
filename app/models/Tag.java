package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.ConstraintViolation;

import play.data.validation.Constraints.Required;
import play.data.validation.Validation;
import play.db.ebean.Model;

import com.fasterxml.jackson.databind.JsonNode;

import functions.Funciones;

@SuppressWarnings("serial")
@Entity
public class Tag extends Model {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	public Long id;
	@Required
	public String tag;

	@ManyToMany(cascade = CascadeType.ALL)
	public List<Tarea> tareas = new ArrayList<Tarea>();

	private static Integer LIMIT = Funciones.LIMIT;
	public static Finder<Long, Tag> finder = new Finder<Long, Tag>(Long.class,
			Tag.class);

	public Tag(JsonNode input) {
		super();
		this.tag = input.get("tag").asText();
	}

	/**
	 * Busca un tag por ID
	 * 
	 * @param id
	 * @return
	 */
	public static Tag findById(Long id) {
		return finder.byId(id);
	}

	/**
	 * Buscar tags paginados
	 * 
	 * @param page
	 * @return
	 */
	public static List<Tag> getAll(Integer page) {
		return finder.setMaxRows(LIMIT).setFirstRow((page - 1) * LIMIT)
				.findList();
	}

	public boolean changeData(Tag newData) {
		boolean changed = false;

		if (newData.tag != null) {
			this.tag = newData.tag;
			changed = true;
		}

		return changed;
	}

	public List<String> directValidate() {
		Set<ConstraintViolation<Tag>> violations = Validation.getValidator()
				.validate(this);
		List<String> errors = new ArrayList<String>();
		for (ConstraintViolation<Tag> cv : violations) {
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
