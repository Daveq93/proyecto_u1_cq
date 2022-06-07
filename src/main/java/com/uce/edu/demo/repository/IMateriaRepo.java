package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepo {

	
	void insertar(Materia materia);
	Materia buscar(String nombre);
	
	void actualizar(Materia materia);
	void eliminar(String nombre);
}
