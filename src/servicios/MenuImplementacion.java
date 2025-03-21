package servicios;

import controladores.Inicio;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public byte mostrarMenuYSeleccionarOpcion() {
		System.out.println("---MENÚ---");
		System.out.println("0.Cerrar menú");
		System.out.println("1.Menú Empleado");
		System.out.println("2.Menú Gerencia");
		System.out.println("----------");
		System.out.println("Introduzca la opcion deseada: ");
		byte opcionUsuario = Inicio.scanner.nextByte();
		return opcionUsuario;
	}

	@Override
	public byte menuEmpleado() {
		System.out.println("---MENÚ EMPLEADO---");
		System.out.println("0.Volver al menú principal");
		System.out.println("1.Añadir venta");
		System.out.println("2.Cálculo total de ventas");
		System.out.println("----------");
		System.out.println("Introduzca la opcion deseada: ");
		byte opcionUsuario = Inicio.scanner.nextByte();
		return opcionUsuario;
	}

	@Override
	public byte menuGerencia() {
		System.out.println("---MENÚ---");
		System.out.println("0.Volver al menú principal");
		System.out.println("1.Mostrar todas las ventas del dia");
		System.out.println("2.Crear nuevo pedido");
		System.out.println("----------");
		System.out.println("Introduzca la opcion deseada: ");
		byte opcionUsuario = Inicio.scanner.nextByte();
		return opcionUsuario;
	}

}
