package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class IMateriaRepoImpl implements IMateriaRepo{

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("insertando materia");
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("buscando materia: "+nombre);
		return null;
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando materia");
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando materia");
	}

}
