package com.uce.edu.demo.matriculacion.vehicular;

import org.springframework.stereotype.Component;

@Component
public class Vehiculo {

	private String marca;
	private String placa;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
}
