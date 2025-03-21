package controladores;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import dtos.ProductoDto;
import dtos.VentaDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaEmpleado;
import servicios.OperativaEmpleadoInterfaz;
import servicios.OperativaGerencia;
import servicios.OperativaGerenciaInterfaz;

/**
 * @author amorcia
 * 21/03/2025
 */
public class Inicio {

	public static Scanner scanner = new Scanner(System.in);
	public static long idAuxiliarProducto = 1;
	public static long idAuxiliarEmpleado = 1;
	public static long idAuxiliarVenta = 1;
	public static ArrayList<ProductoDto> productos = new ArrayList<ProductoDto>();
	public static ArrayList<VentaDto> ventas = new ArrayList<VentaDto>();

	
	public static void main(String[] args) {
		MenuInterfaz menu = new MenuImplementacion();
		OperativaEmpleadoInterfaz operativaEmpleado = new OperativaEmpleado();
		OperativaGerenciaInterfaz operativaGerencia = new OperativaGerencia();
		VentaDto horaApertura = new VentaDto();
		boolean esCerrado = false;
		
		do {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			horaApertura.setFechaYHoraApertura(LocalDateTime.now().format(formato));
			switch (menu.mostrarMenuYSeleccionarOpcion()) {
			case 0: 
				esCerrado = true;
				System.out.println("Cerrando menú");
				break;
			case 1: 
				switch (menu.menuEmpleado()){
				case 0: 
					
					break;
				case 1: 
					operativaEmpleado.añadirVenta();
					break;
				case 2: 
					operativaEmpleado.calcularTotalVentas();
					break;
				
				default:
					System.out.println("Opción deseada inexistente.");
					break;
				}
				break;
			case 2: 
				switch (menu.menuGerencia()){
				case 0: 
					
					break;
				case 1: 
					operativaGerencia.mostrarVentas();
					break;
				case 2: 
					operativaGerencia.crearPedido();
					break;
				
				default:
					System.out.println("Opción deseada inexistente.");
					break;
				}
				break;
			
			default:
				System.out.println("Opción deseada inexistente.");
				break;
			}
		} while (!esCerrado);
	}

}
