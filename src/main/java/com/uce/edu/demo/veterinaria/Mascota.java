package com.uce.edu.demo.veterinaria;

import org.springframework.stereotype.Component;

@Component
public class Mascota {
	protected String nombre;
	protected Integer edad;
	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	//set and get
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected Integer getEdad() {
		return edad;
	}
	protected void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
}
