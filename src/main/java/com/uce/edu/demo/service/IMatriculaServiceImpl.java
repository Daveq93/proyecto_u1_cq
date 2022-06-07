package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepo;

@Service
public class IMatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo matriculaRepo;
	
	@Override
	public void insertarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertar(matricula);
	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepo.buscar(numero);
		return null;
	}

	@Override
	public void actualizarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.actualizar(matricula);
	}

	@Override
	public void eliminarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepo.eliminar(numero);
	}

}
