package controllers;

import java.util.List;

import models.Tag;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;

import functions.Funciones;

public class Tags extends Controller {

	/**
	 * Tags paginados
	 * @param pagina: número de la página a mostrar
	 * @return: lista de tags en formato JSON
	 */
	public static Result index(Integer pagina) {
		List<Tag> lista = Tag.getAll(pagina);
		//List<String> tags = new ArrayList<String>();
		if (lista.size() > 0) {
			//for (int i = 0; i < lista.size(); i++)
				//tags.add(lista.get(i).tag);
			return Funciones.okJson(views.txt.tags.render(lista));
		} else
			return Funciones.errorNotFound(0, "No hay tags en esa página");
	}

	/**
	 * Crea un tag a partir de los datos contenidos en el Body
	 * 
	 * @return: el tag generado
	 */
	public static Result create() {
		if (Funciones.contentIsJson()) {
			JsonNode datos = request().body().asJson();
			if (datos.hasNonNull("tag")) {
				Tag tag = new Tag(datos);
				tag.save();
				return Funciones.okJson(views.txt._tag.render(tag));
			} else
				return Funciones.errorInputData();
		} else
			return Funciones.errorNotSupported();
	}

	/**
	 * Recupera un tag determinado
	 * 
	 * @param id
	 *            : el ID del tag a buscar
	 * @return: los datos del tag
	 */
	public static Result retrieve(Long id) {
		Tag tag = Tag.findById(id);
		if (tag != null) {
			return Funciones.okJson(views.txt._tag.render(tag));
		} else
			return Funciones.errorNotFound(0, "Tag no encontrado");
	}

	/**
	 * Actualiza el nombre del tag
	 * 
	 * @param id
	 *            : ID del tag
	 * @return: el tag actualizado en JSON
	 */
	public static Result update(Long id) {
		if (Funciones.contentIsJson()) {
			JsonNode datos = request().body().asJson();
			if (datos.hasNonNull("tag")) {
				Tag tag = Tag.findById(id);
				if (tag != null) {
					tag.changeData(new Tag(datos));
					tag.update();
					return Funciones.okJson(views.txt._tag.render(tag));
				} else
					return Funciones.errorNotFound(0, "Tag no encontrado");
			} else
				return Funciones.errorInputData();
		} else
			return Funciones.errorNotSupported();
	}

	/**
	 * Elimina un determinado tag
	 * 
	 * @param id
	 *            : ID del tag a eliminar
	 * @return: ok
	 */
	public static Result delete(Long id) {
		Tag tag = Tag.findById(id);
		if (tag != null) {
			tag.delete();
			return ok();
		} else
			return Funciones.errorNotFound(0, "Tag no encontrada");
	}
}
