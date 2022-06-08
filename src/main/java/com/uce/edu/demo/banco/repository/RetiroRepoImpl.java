package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepoImpl implements IRetiroRepo{

	@Override
	public void insertar(Retiro retiro) {
		// TODO Auto-generated method stub
		System.out.println("Insertando retiro: "+retiro.toString());
	}

	@Override
	public Retiro buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Buscando retiro por fecha: "+fecha);
		return null;
	}

	@Override
	public void actualizar(Retiro retiro) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando retiro: "+retiro.toString());
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando retiro por fecha: "+fecha);
	}

}
