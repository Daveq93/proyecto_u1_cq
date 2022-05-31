package com.uce.edu.demo.matricula;

import org.springframework.stereotype.Component;

@Component
public class Estudiante {
	private String nombre;
	private String cedula;
	
	//set and get
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
