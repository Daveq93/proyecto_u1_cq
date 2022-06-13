package com.uce.edu.demo.santamaria.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {

	private String codigo;
	private Integer cantidad;
	private LocalDateTime fechaIngreso;
	private Producto producto;

	
	
	@Override
	public String toString() {
		return "Inventario [cantidad=" + cantidad + ", fechaIngreso=" + fechaIngreso + ", producto=" + producto + "]";
	}

	// set and get
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


}
