package com.uce.edu.demo.veterinaria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Veterinaria {
	private static final Logger LOG = LoggerFactory.getLogger(Veterinaria.class);


	//@Autowired
	private Perro perro;

	//@Autowired
	private Gato gato;
	
	public Veterinaria(Perro perro, Gato gato) {
		this.perro=perro;
		this.gato=gato;
	}
	
	public String registrarMascota(String nombre, Integer edad,Integer tipo,String raza,String colOjos) {
		

		if(tipo.equals(1)) {
			this.perro.setNombre(nombre);
			this.perro.setEdad(edad);
			perro.setRaza(raza);
			System.out.println(perro.toString());
		}else {
			this.gato.setNombre(nombre);
			this.gato.setEdad(edad);
			gato.setColorOjos(colOjos);
			System.out.println(gato.toString());
		}
		
		LOG.info("Guardado en la base de datos...");
		return "Mascota registrada";
	}
}
