package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteService {

	void insertarEstudiante(Estudiante estudiante);

	Estudiante buscarEstudiante(String cedula);

	void actualizarEstudiante(Estudiante estudiante);

	void eliminarEstudiante(String cedula);
}
