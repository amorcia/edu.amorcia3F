package servicios;

import java.time.Duration;
import java.time.LocalDateTime;

import controladores.Inicio;
import dtos.VentaDto;

public class OperativaEmpleado implements OperativaEmpleadoInterfaz {

	@Override
	public void añadirVenta() {
		System.out.println("Introduzca el importe de la venta realizada: ");
		long ventaAAñadir = Inicio.scanner.nextLong();
		VentaDto venta = new VentaDto(ventaAAñadir);
		Inicio.ventas.add(venta);
	}

	@Override
	public void calcularTotalVentas() {
		
		System.out.println("Introduzca la fecha en formato (dd-MM-yyyy): ");
		String fechaFiltro = Inicio.scanner.next();
		
		for(VentaDto venta : Inicio.ventas) {
			if(fechaFiltro.equals(venta.getFechaVenta())) {
				/*Duration duracion = Duration.between(LocalDateTime.parse(venta.getFechaYHoraApertura()),LocalDateTime.parse(venta.getFechaYHoraVenta()));
				long horas = duracion.toHours();
				long minutos = duracion.toMinutes();
				long segundos = duracion.toSeconds();*/
				
				System.out.println("Total Ventas: ".concat(Long.toString(venta.getTotalVenta())));
				//System.out.println("Tiempo transcurrido: ".concat(Long.toString(horas)).concat(" horas")
					//	.concat(Long.toString(minutos)).concat(" minutos").concat(Long.toString(segundos)).concat(" segundos"));
			}
		}
	}

}
