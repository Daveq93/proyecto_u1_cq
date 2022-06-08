package com.uce.edu.demo.matricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matriculas {

	//@Autowired
	private Estudiante estudiante;
	//@Autowired
	private Materia materia;

	public Matriculas(Estudiante estudiante, Materia materia) {
		this.estudiante = estudiante;
		this.materia = materia;
		System.out.println("DI por constructor");
	}

	public Matriculas() {
		// TODO Auto-generated constructor stub
	}

	public String matricular(String nombre, String cedula, String nombreMateria, Integer creditos) {

		this.estudiante.setNombre(nombre);
		this.estudiante.setCedula(cedula);
		this.materia.setNombre(nombreMateria);
		this.materia.setCreditos(creditos);

		System.out.println("Registrando en la base de datos ...");

		return "matriculado";
	}

	
	//Inyeccion de dependencias por los metodos set
	public Estudiante getEstudiante() {
		return estudiante;
	}

	@Autowired
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	@Autowired
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	
	
	
}
