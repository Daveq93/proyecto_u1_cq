package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo matriculaRepo;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profeMateria;
	
	@Lookup //hace referencia al bean creado
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria prfM = new ProfesorMateria();
		prfM.setApellido("Quizhpe");
		prfM.setNombre("Cristian");
		return prfM;
	}
	
	@Override
	public void insertarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		//System.out.println("Verificando instancia desde service SINGLETON: "+this.profesorGeneral);
		//System.out.println("verificando Prototype: "+this.profeMateria);
		
		
		System.out.println("DI en metodo: GENERAL "+this.obtenerProfesorG());
		
		System.out.println("DI en metodo: MATERIA "+this.obtenerProfesorM());
		
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
