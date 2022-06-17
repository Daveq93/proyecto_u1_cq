package com.uce.edu.demo.vuelo.modelo;

public class Usuario {

	private String nombre;
	private String cedula;
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	//Set and get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
}
