package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;

public class VentaDto {
	long id;
	long venta = 0;
	long totalVenta = 0;
	DateTimeFormatter formatoDef = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String fechaYHoraApertura = LocalDateTime.MAX.format(formatoDef);
	String fechaYHoraVenta = LocalDateTime.MAX.format(formatoDef);
	DateTimeFormatter formatoFichero = DateTimeFormatter.ofPattern("ddMMyyyy");
	String fechaVenta = LocalDate.MAX.format(formatoFichero);
	String tituloFichero = LocalDate.MAX.format(formatoFichero);

	public VentaDto(long venta) {
		super();
		this.id = Inicio.idAuxiliarVenta;
		Inicio.idAuxiliarVenta = this.id;
		Inicio.idAuxiliarVenta++;
		this.fechaYHoraVenta = LocalDateTime.now().format(formatoDef);
		String[] pasarAFecha = fechaYHoraVenta.split(" ");
		this.fechaVenta = pasarAFecha[0];
		String[] fechaTitulo = this.fechaVenta.split("-");
		this.tituloFichero = fechaTitulo[0].concat(fechaTitulo[1]).concat(fechaTitulo[2]);
		this.venta = venta;
		this.totalVenta += venta;
	}
	
	public VentaDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVenta() {
		return venta;
	}

	public void setVenta(long venta) {
		this.venta = venta;
	}
	public long getTotalVenta() {
		return totalVenta;
	}

	public String getFechaYHoraApertura() {
		return fechaYHoraApertura;
	}

	public void setFechaYHoraApertura(String fechaYHoraApertura) {
		this.fechaYHoraApertura = fechaYHoraApertura;
	}

	public String getFechaYHoraVenta() {
		return fechaYHoraVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}
	
	public String getTituloFichero() {
		return tituloFichero;
	}

	@Override
	public String toString() {
		return "..........".concat("\n").concat("Venta número: ").concat(Long.toString(id)).concat("\n")
				.concat("Euros: ").concat(Long.toString(venta)).concat("\n").concat("Instante de compra: ")
				.concat(fechaVenta);
	}
	
	
}
