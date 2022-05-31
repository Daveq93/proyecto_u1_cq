package com.uce.edu.demo.matriculacion.vehicular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculacionVehicular {

	@Autowired
	private Vehiculo vehiculo;
	@Autowired
	private Propietario propietario;
	
	public MatriculacionVehicular(Vehiculo vehiculo, Propietario propietario) {
		System.out.println("Inyeccion de dependencias por constructor");
		this.vehiculo=vehiculo;
		this.propietario=propietario;
		
	}
	
	public String matricularVehiculo(String marca, String placa, String nombre, String apellido, String cedula) {
		
		this.vehiculo.setMarca(marca);
		this.vehiculo.setPlaca(placa);
		this.propietario.setNombre(nombre);
		this.propietario.setApellido(apellido);
		this.propietario.setCedula(cedula);
		
		return "Vehiculo matriculado";
	}

	
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	

	public Propietario getPropietario() {
		return propietario;
	}

	//Inyeccion de dependencias usando el metodo set
	@Autowired
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Autowired
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	
	
}
