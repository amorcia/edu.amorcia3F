package servicios;

/**
 * @author amorcia
 * 21/03/2025
 * Interfaz encargada de los metodos de menu y seleccion de opcion
 */
public interface MenuInterfaz {
	
	/**
	 * @author amorcia
	 * 21/03/2025
	 * Método encargado del menu ciclico principal
	 */
	byte mostrarMenuYSeleccionarOpcion();
	/**
	 * @author amorcia
	 * 21/03/2025
	 * Metodo encargado del menu del empleado
	 */
	byte menuEmpleado();
	/**
	 * @author amorcia
	 * 21/03/2025
	 * Metodo encargado del menu de la gerencia
	 */
	byte menuGerencia();
}
