package com.uce.edu.demo.matricula;

import org.springframework.stereotype.Component;

@Component
public class Materia {

	private String nombre;
	private Integer creditos;
	
	
	//set and get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCreditos() {
		return creditos;
	}
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	
	
	
}
