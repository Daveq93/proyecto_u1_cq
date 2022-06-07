package com.uce.edu.demo.modelo;

import java.util.List;

public class Matricula {

	private String numero;
	private Estudiante estudiante;
	private List<Materia> materias;
	
	
	//set y get
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	
	
	
	
	
}
