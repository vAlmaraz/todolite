package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.ConstraintViolation;

import play.data.validation.Constraints.Required;
import play.data.validation.Validation;
import play.db.ebean.Model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import functions.Funciones;

@SuppressWarnings("serial")
@Entity
public class Tarea extends Model {

	@Id
	public Long id;
	@Required
	public String descripcion;
	public Boolean realizada;

	@ManyToOne
	public Usuario autor;

	@ManyToMany(mappedBy = "tareas")
	public List<Tag> tags = new ArrayList<Tag>();

	private static Integer LIMIT = Funciones.LIMIT;
	public static Finder<Long, Tarea> finder = new Finder<Long, Tarea>(
			Long.class, Tarea.class);

	public Tarea(Long id, JsonNode input) {
		super();
		if ((this.autor = Usuario.findById(id)) != null) {
			this.descripcion = input.get("descripcion").asText();
			this.realizada = false;
		}
	}

	/**
	 * Añade los tags incluidos en el Json del body
	 * @param input: datos de entrada
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
	public void addTags(JsonNode input) throws JsonProcessingException, IOException {
		
		final JsonNode arrNode = new ObjectMapper().readTree(input.toString()).get("tags");
		if (arrNode.isArray()) {
		    for (final JsonNode objNode : arrNode) {
		    	System.out.println(objNode.get("tag").asLong());
		        this.tags.add(Tag.findById(objNode.get("tag").asLong()));
		    }
		}
	}

	/**
	 * Recupera los tags de una determinada tarea paginados
	 * @param id: ID del autor
	 * @param tarea: ID de la tarea
	 * @param pagina: número de página
	 * @return: lista de tags en String
	 */
	public List<Tag> getTags(Long id, Long tarea, Integer pagina) {
		List<Tag> tags = finder.where().eq("autor", Usuario.findById(id))
				.eq("id", tarea).findUnique().tags;
		//List<String> nombres = new ArrayList<String>();
		//for (Tag tag : tags)
			//nombres.add(tag.tag);
		return tags;
	}

	/**
	 * Devuelve la lista de tareas de un autor paginadas
	 * @param id: ID del autor
	 * @param page: número de la página
	 * @return: lista de Tareas
	 */
	public static List<Tarea> getAll(Long id, Integer page) {
		return finder.where().eq("autor", Usuario.findById(id))
				.setMaxRows(LIMIT).setFirstRow((page - 1) * LIMIT).findList();
	}

	/**
	 * Busca una tarea por ID de un autor determinado
	 * @param id: ID del autor
	 * @param tarea: ID de la tarea
	 * @return: la Tarea a buscar
	 */
	public static Tarea findById(Long id, Long tarea) {
		return finder.where().eq("autor", Usuario.findById(id)).eq("id", tarea)
				.findUnique();
	}
	
	/**
	 * Busca tareas de un usuario a las que se le hayan asignado un determinado tag
	 * @param id: ID del autor
	 * @param tag: nombre del tag en String
	 * @return: lista de tareas encontradas
	 */
	public static List<Tarea> findByTagName(Long id, String tag) {
		return finder.fetch("tags").where().eq("autor.id", id).eq("tag", tag).findList();
	}

	public boolean changeData(Tarea newData) {
		boolean changed = false;

		if (newData.descripcion != null) {
			this.descripcion = newData.descripcion;
			this.realizada = newData.realizada;
			changed = true;
		}

		return changed;
	}

	public List<String> directValidate() {
		Set<ConstraintViolation<Tarea>> violations = Validation.getValidator()
				.validate(this);
		List<String> errors = new ArrayList<String>();
		for (ConstraintViolation<Tarea> cv : violations) {
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
