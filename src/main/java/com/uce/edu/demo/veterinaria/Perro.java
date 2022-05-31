package com.uce.edu.demo.veterinaria;

import org.springframework.stereotype.Component;

@Component
public class Perro extends Mascota{

	private String raza;

	//set and get
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return super.toString()+"Perro [raza=" + raza + "]";
	}
	
	
	
}
