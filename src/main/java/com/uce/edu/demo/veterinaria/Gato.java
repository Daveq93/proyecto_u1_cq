package com.uce.edu.demo.veterinaria;

import org.springframework.stereotype.Component;

@Component
public class Gato  extends Mascota{

	private String colorOjos;

	
	
	//set and get
	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	
	
}
