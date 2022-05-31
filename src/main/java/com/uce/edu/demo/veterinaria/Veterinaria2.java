package com.uce.edu.demo.veterinaria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Veterinaria2 {
	private static final Logger LOG = LoggerFactory.getLogger(Veterinaria2.class);


	//@Autowired
	private Perro perro;

	//@Autowired
	private Gato gato;
	
	
	
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
		return "Mascota registrada metodo de inyeccion por set";
	}

	public Perro getPerro() {
		return perro;
	}

	@Autowired
	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	public Gato getGato() {
		return gato;
	}

	@Autowired
	public void setGato(Gato gato) {
		this.gato = gato;
	}
	
	
	
}
