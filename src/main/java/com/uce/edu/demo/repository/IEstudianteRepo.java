package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	//CRUD
	
	 void insertar(Estudiante estudiante);
	
	 Estudiante buscar(String cedula);
	
	void actualizar(Estudiante estudiante);
	
	void eliminar(String cedula);
}
