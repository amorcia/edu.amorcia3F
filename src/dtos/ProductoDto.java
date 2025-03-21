package dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;

public class ProductoDto {
	long id;
	String nombre = "aaaaa";
	long cantidad = 0;
	DateTimeFormatter formatoDef = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String fechaEntrega = LocalDate.MAX.format(formatoDef);
	
	public ProductoDto(String nombre, long cantidad) {
		super();
		this.id = Inicio.idAuxiliarProducto;
		Inicio.idAuxiliarProducto = this.id;
		Inicio.idAuxiliarProducto++;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaEntrega = LocalDate.now().format(formatoDef);
	}
	public long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	@Override
	public String toString() {
		return "..........".concat("\n").concat("Producto: ").concat(nombre).concat("\n").concat("Cantidad: ")
				.concat(Long.toString(cantidad)).concat("\n").concat("Fecha entrega: ").concat(fechaEntrega);
	}
	
	
	
}
