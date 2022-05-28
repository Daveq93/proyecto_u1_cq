package com.uce.edu.consultorio;

public class Paciente {

	
	private String nombre;
	private Integer edad;
	
	
	
	
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", edad=" + edad + "]";
	}
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
}
