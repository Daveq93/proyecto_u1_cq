package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//Voy a agregar metadata a esta clase
@Component
public class Doctor {

	private String nombre;
	private String apellido;
	private Integer edad;
	private String ciudad;
	
	
	
	
	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	
	
}
