package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepo;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepo materiaRepo;
	
	@Override
	public void insertarMateria(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.insertar(materia);
	}

	@Override
	public Materia buscarMateriaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepo.buscar(nombre);
		return null;
	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.actualizar(materia);
	}

	@Override
	public void eliminarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepo.eliminar(nombre);
	}

}
