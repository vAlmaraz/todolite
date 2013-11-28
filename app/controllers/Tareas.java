package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.Tarea;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import functions.Funciones;

public class Tareas extends Controller {


	/**
	 * Tareas paginadas según el ID del autor
	 * @param id: ID del autor
	 * @param pagina: página a mostrar
	 * @return: lista de tareas generada en formato JSON
	 */
	public static Result index(Long id, Integer pagina) {
		if (Usuario.findById(id) != null) {
			List<Tarea> lista = Tarea.getAll(id, pagina);
			List<String> descripciones = new ArrayList<String>();
			List<Boolean> realizadas = new ArrayList<Boolean>();
			if (lista.size() > 0) {
				for (int i = 0; i < lista.size(); i++) {
					descripciones.add(lista.get(i).descripcion);
					realizadas.add(lista.get(i).realizada);
				}
				return Funciones.okJson(views.txt.tareas.render(descripciones,
						realizadas));
			} else
				return Funciones.errorNotFound(0,
						"No hay tareas en esa página");
		} else
			return Funciones.errorNotFound(0, "Usuario no encontrado");
	}

	/**
	 * Busca tareas de un usuario a las que se le hayan asignado un determinado tag
	 * @param id: ID del usuario
	 * @param tag: nombre del tag en String
	 * @return: lista de Tareas encontradas en JSON
	 */
	public static Result tareasByTagName(Long id, String tag) {
		List<Tarea> lista = Tarea.findByTagName(id,tag);
		List<String> descripciones = new ArrayList<String>();
		List<Boolean> realizadas = new ArrayList<Boolean>();
		if (lista != null && lista.size() > 0) {
			for (int i = 0; i < lista.size(); i++) {
				descripciones.add(lista.get(i).descripcion);
				realizadas.add(lista.get(i).realizada);
			}
			return Funciones.okJson(views.txt.tareas.render(descripciones,
					realizadas));
		} else
			return Funciones.errorNotFound(0, "No hay tareas");
	}

	/**
	 * Creación de una tarea asignada a un usuario por ID
	 * @param id: ID del usuario
	 * @return: la tarea generada en JSON
	 */
	public static Result create(Long id) {
		if (Funciones.contentIsJson()) {
			JsonNode datos = request().body().asJson();
			if (datos.hasNonNull("descripcion")) {
				Tarea nuevaTarea = new Tarea(id, datos);
				if (nuevaTarea.autor != null) {
					nuevaTarea.save();
					return Funciones.okJson(views.txt._tarea.render(
							nuevaTarea.descripcion, nuevaTarea.realizada));
				} else
					return Funciones.errorNotFound(0, "Usuario no encontrado");
			} else
				return Funciones.errorInputData();
		} else
			return Funciones.errorNotSupported();
	}

	/**
	 * Busca una tarea de un determinado autor por ID
	 * @param id: ID del autor de la tarea
	 * @param tarea: ID de la tarea a buscar
	 * @return: la tarea buscada en JSON
	 */
	public static Result retrieve(Long id, Long tarea) {
		if (Usuario.findById(id) != null) {
			Tarea mTarea = Tarea.findById(id, tarea);
			if (mTarea != null)
				return Funciones.okJson(views.txt._tarea.render(
						mTarea.descripcion, mTarea.realizada));
			else
				return Funciones.errorNotFound(0, "Tarea no encontrada");
		} else
			return Funciones.errorNotFound(0, "Usuario no encontrado");
	}

	/**
	 * Modificación de los datos de una tarea
	 * @param id: ID del autor
	 * @param tarea: ID de la tarea a modificar
	 * @return: los datos de la tarea ya actualizada en JSON
	 */
	public static Result update(Long id, Long tarea) {
		if (Funciones.contentIsJson()) {
			JsonNode datos = request().body().asJson();
			if (datos.hasNonNull("descripcion")) {
				Tarea mTarea = Tarea.findById(id, tarea);
				if (mTarea != null) {
					mTarea.changeData(new Tarea(id, datos));
					mTarea.update();
					return Funciones.okJson(views.txt._tarea.render(
							mTarea.descripcion, mTarea.realizada));
				} else
					return Funciones.errorNotFound(0, "Tarea no encontrada");
			} else
				return Funciones.errorInputData();
		} else
			return Funciones.errorNotSupported();
	}

	/**
	 * Elimina una determinada tarea
	 * @param id: ID del autor
	 * @param tarea: ID de la tarea
	 * @return: ok
	 */
	public static Result delete(Long id, Long tarea) {
		Usuario usuario = Usuario.findById(id);
		if (usuario != null) {
			Tarea mTarea = Tarea.findById(id, tarea);
			if (mTarea != null) {
				mTarea.delete();
				return ok();
			} else {
				return Funciones.errorNotFound(0, "Tarea no encontrada");
			}
		} else
			return Funciones.errorNotFound(0, "Usuario no encontrado");
	}

	/**
	 * Marca una tarea como realizada
	 * @param id: ID del autor
	 * @param tarea: ID de la tarea
	 * @return: los datos de la tarea
	 */
	public static Result done(Long id, Long tarea) {
		Tarea mTarea = Tarea.findById(id, tarea);
		if (mTarea != null) {
			mTarea.realizada = true;
			mTarea.update();
			return Funciones.okJson(views.txt._tarea.render(
					mTarea.descripcion, mTarea.realizada));
		} else
			return Funciones.errorNotFound(0, "Tarea no encontrada");
	}

	public static Result addTags(Long id, Long tarea) throws JsonProcessingException, IOException {
		if (Funciones.contentIsJson()) {
			JsonNode datos = request().body().asJson();
			Tarea mTarea = Tarea.findById(id, tarea);
			if (mTarea != null) {
				mTarea.addTags(datos);
				mTarea.save();
				return ok();
			} else
				return Funciones.errorNotFound(0, "Tarea no encontrada");
		} else
			return Funciones.errorNotSupported();
	}

	public static Result getTags(Long id, Long tarea, Integer pagina) {
		if (Usuario.findById(id) != null) {
			Tarea mTarea = Tarea.findById(id, tarea);
			if (mTarea != null) {
				return Funciones.okJson(views.txt.tags.render(mTarea.getTags(
						id, tarea, pagina)));
			} else
				return Funciones.errorNotFound(0, "Tarea no encontrada");
		} else
			return Funciones.errorNotFound(0, "Usuario no encontrado");
	}
}
