package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepo {

	void insertar(Matricula matricula);
	Matricula buscar(String numero);
	void actualizar(Matricula matricula);
	void eliminar(String numero);
	
}
