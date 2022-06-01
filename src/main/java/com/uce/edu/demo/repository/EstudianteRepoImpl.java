package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	@Override
	public void insertar(Estudiante estudiante) {
		System.out.println("Insertando estudiante: "+estudiante.toString());
		
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Buscando estudiante con cedula: "+cedula);
		return null;
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando estudiante: "+estudiante.toString());
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando estudiante con cedula: "+cedula);
	}

}
