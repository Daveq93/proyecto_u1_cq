package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepoImpl implements IDepositoRepo {

	@Override
	public void insertar(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito de: "+deposito.toString());
	}

}
