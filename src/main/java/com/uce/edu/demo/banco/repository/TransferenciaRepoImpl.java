package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepoImpl implements ITransferenciaRepo{

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("Realizando proceso  de transferencia (Repository): "+transferencia.toString());
		
	}

}
