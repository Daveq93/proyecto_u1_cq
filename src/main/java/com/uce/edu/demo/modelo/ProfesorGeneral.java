package com.uce.edu.demo.modelo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)//hace referencia al bean creado en el contexto, no se crea una nueva instancia
//@Scope(value =ConfigurableBeanFactory.SCOPE_PROTOTYPE) //crea una nueva instancia del bean
//@Scope("singleton") //otra forma de declarar, pero no es recomendable
public class ProfesorGeneral {

	private String nombre;
	private String apellido;
	
	@Override
	public String toString() {
		return "ProfesorGeneral [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	//set and get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
