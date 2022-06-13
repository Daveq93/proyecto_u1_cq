package com.uce.edu.demo.santamaria.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteProdTo {

	
	private String nombre;
	private Integer cantidad;
	private BigDecimal precioVenta;
	private LocalDateTime fechaIngreso;
		
	@Override
	public String toString() {
		return "ReporteProdTo [nombre=" + nombre + ", cantidad=" + cantidad + ", precioVenta= $" + precioVenta
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	//set adn get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
}
