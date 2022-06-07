package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	void insertarMatricula(Matricula matricula);
	Matricula buscarMatricula(String numero);
	void actualizarMatricula(Matricula matricula);
	void eliminarMatricula(String numero);
}
