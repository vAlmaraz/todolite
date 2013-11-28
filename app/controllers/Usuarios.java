package controllers;

import java.util.List;

import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;

import functions.Funciones;

public class Usuarios extends Controller {

	/**
	 * Usuarios paginados
	 * @param pagina: número de la página a mostrar
	 * @return: lista de usuarios en formato JSON
	 */
	public static Result index(Integer pagina) {
		List<Usuario> lista = Usuario.getAll(pagina);
		//List<String> usuarios = new ArrayList<String>();
		if (lista.size() > 0) {
			//for (int i = 0; i < lista.size(); i++)
				//usuarios.add(lista.get(i).nombre);
			return Funciones.okJson(views.txt.usuarios.render(lista));
		} else
			return Funciones.errorNotFound(0, "No hay usuarios en esa página");
	}

	/**
	 * Creación de un usuario nuevo
	 * @return: el usuario generado en JSON
	 */
	public static Result create() {
		if (Funciones.contentIsJson()) {
			JsonNode datos = request().body().asJson();
			if (datos.hasNonNull("nombre")) {
				Usuario nuevoUsuario = new Usuario(datos);
				nuevoUsuario.save();
				return Funciones.okJson(views.txt._usuario
						.render(nuevoUsuario));
			} else
				return Funciones.errorInputData();
		} else
			return status(415, "Formato de entrada no soportado");
	}

	/**
	 * Recuperación de un usuario por ID
	 * @param id: ID del usuario a buscar
	 * @return: los datos del usuario en JSON
	 */
	public static Result retrieve(Long id) {
		Usuario usuario = Usuario.findById(id);
		if (usuario != null) {
			return Funciones.okJson(views.txt._usuario.render(usuario));
		} else
			return Funciones.errorNotFound(0, "Usuario no encontrado");
	}

	/**
	 * Recuperación de un usuario por Nombre
	 * @param nombre: nombre a buscar
	 * @return: el usuario en JSON
	 */
	public static Result retrieveByName(String nombre) {
		Usuario usuario = Usuario.findName(nombre);
		if (usuario != null) {
			return Funciones.okJson(views.txt._usuario.render(usuario));
		} else
			return Funciones.errorNotFound(0, "Usuario no encontrado");
	}

	/**
	 * Recuperación de usuarios por nombre
	 * @param nombre: nombre a buscar
	 * @param pagina: número de la página a mostrar
	 * @return: lista de usuarios en JSON
	 */
	public static Result retrieveNames(String nombre, Integer pagina) {
		List<Usuario> lista = Usuario.findNames(nombre, pagina);
		//List<String> usuarios = new ArrayList<String>();
		if (lista.size() > 0) {
			//for (int i = 0; i < lista.size(); i++)
				//usuarios.add(lista.get(i).nombre);
			return Funciones.okJson(views.txt.usuarios.render(lista));
		} else
			return Funciones.errorNotFound(0, "No se han encontrado usuarios");
	}

	/**
	 * Modificación de los datos de un usuario por ID
	 * @param id: ID del usuario a modificar
	 * @return: el usuario modificado en JSON
	 */
	public static Result update(Long id) {
		if (Funciones.contentIsJson()) {
			Usuario usuario = Usuario.findById(id);
			if (usuario != null) {
				JsonNode datos = request().body().asJson();
				usuario.changeData(new Usuario(datos));
				usuario.update();
				return Funciones.okJson(views.txt._usuario
						.render(usuario));
			} else
				return Funciones.errorNotFound(0, "Usuario no encontrado");
		} else
			return Funciones.errorNotSupported();
	}

	/**
	 * Eliminación de un usuario por ID
	 * @param id: ID del usuario a eliminar
	 * @return: ok
	 */
	public static Result delete(Long id) {
		Usuario usuario = Usuario.findById(id);
		if (usuario != null) {
			usuario.delete();
			return ok();
		} else
			return Funciones.errorNotFound(0, "Usuario no encontrado");
	}
}
