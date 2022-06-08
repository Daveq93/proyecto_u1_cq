package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepoImpl implements IDepositoRepo {

	@Override
	public void insertar(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito de: "+deposito.toString());
	}

	@Override
	public void actualizar(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando deposito: "+deposito.toString());
	}

	@Override
	public Deposito buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Buscando deposito por fecha: "+fecha);
		return null;
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando deposito por fecha: "+fecha);
	
	}

}
