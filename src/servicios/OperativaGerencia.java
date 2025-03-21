package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.ProductoDto;
import dtos.VentaDto;

public class OperativaGerencia implements OperativaGerenciaInterfaz {

	@Override
	public void mostrarVentas() {
		String rutaArchivo = "aaaaa";
		for(VentaDto venta : Inicio.ventas) {
			System.out.println(venta.toString());
			if(venta.getTituloFichero() != null) {
			rutaArchivo = "ficheros/".concat(venta.getTituloFichero()).concat(".txt");
			}
		}
		
		try (BufferedWriter escribirFichero = new BufferedWriter(new FileWriter(rutaArchivo,true))){
			for(VentaDto venta : Inicio.ventas) {
				escribirFichero.append(venta.toString());
			}
		} catch (IOException e) {
			System.err.println("Error al escribir en el fichero o crearlo");
		}
		
	}

	@Override
	public void crearPedido() {
		String respuestaUsu = "si";
		while(respuestaUsu.equals("si")) {
			System.out.println("Introduzca el nombre del producto: ");
			Inicio.scanner.nextLine();
			String nombreProducto = Inicio.scanner.nextLine();
			System.out.println("Introduzca la cantidad del producto: ");
			long cantidadProducto = Inicio.scanner.nextLong();
			ProductoDto producto = new ProductoDto(nombreProducto,cantidadProducto);
			Inicio.productos.add(producto);
			
			System.out.println("¿Quiere seguir creando pedidos?(Si/No)");
			respuestaUsu = Inicio.scanner.next().toLowerCase();
		}
		for(ProductoDto producto : Inicio.productos) {
			System.out.println(producto.toString());
		}
	}

}
