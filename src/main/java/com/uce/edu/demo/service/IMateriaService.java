package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	
	void insertarMateria(Materia materia);
	Materia buscarMateriaPorNombre(String nombre);
	void actualizarMateria(Materia materia);
	void eliminarMateria(String nombre);
	
}
