package functions;

import play.mvc.Content;
import play.mvc.Controller;
import play.mvc.Result;

public class Funciones {

	// Límite para la paginación de resultados
	public static int LIMIT = 10;

	/**
	 * Comprueba si el Body de la petición contiene texto en formato JSON
	 * 
	 * @return: Verdadero si contiene JSON
	 */
	public static boolean contentIsJson() {
		String content = Controller.request().getHeader("Content-Type");
		return content.startsWith("application/json");
	}

	/**
	 * Realiza un OK añadiendo a la cabecera de la respuesta que el contenido es
	 * JSON
	 * @param c: contenido de la respuesta
	 * @return: un OK en JSON
	 */
	public static Result okJson(Content c) {
		Controller.response().setContentType("application/json");
		return Controller.ok(c);
	}

	/**
	 * Mensaje de error para mostrar cuando se recibe una petición con un
	 * contenido distinto a los soportados por la aplicación
	 * @return: un error 415
	 */
	public static Result errorNotSupported() {
		return Controller.status(415, "Formato de entrada no soportado");
	}

	/**
	 * Mensaje de error para indicar que el contenido de la petición no corresponde con lo esperado
	 * @return: un error 400
	 */
	public static Result errorInputData() {
		return Controller.status(400, "Datos de entrada no válidos");
	}

	/**
	 * Mensaje de error personalizado para indicar que el recurso solicitado no ha sido encontrado
	 * @param code: código del error
	 * @param message: cadena de caracteres para describir el error
	 * @return: un error 404 con contenido JSON
	 */
	public static Result errorNotFound(Integer code, String message) {
		Controller.response().setContentType("application/json");
		return Controller.notFound(views.txt.error_json.render(code, message));
	}
}
