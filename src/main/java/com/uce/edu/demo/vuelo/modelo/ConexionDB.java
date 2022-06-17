package com.uce.edu.demo.vuelo.modelo;

public class ConexionDB {

	private String name;
	private String tipo;
	
	@Override
	public String toString() {
		return "ConexionDB [name=" + name + ", tipo=" + tipo + "]";
	}
	//set and get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
