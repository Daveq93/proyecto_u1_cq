package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepoImpl implements ITransferenciaRepo{

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("Realizando proceso  de transferencia (Repository): "+transferencia.toString());
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando Transferencia: "+transferencia.toString());
	}

	@Override
	public Transferencia buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por fecha de transferencia: "+fecha);
		return null;
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando transferencia por fecha");
	}

}
