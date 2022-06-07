package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class IMatriculaRepoImpl implements IMatriculaRepo{

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Insertando matricula: "+matricula.toString());
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Buscando matricula con numero: "+numero);
		return null;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando matricula: "+matricula.toString());
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando matricula: "+numero);
	}

}
