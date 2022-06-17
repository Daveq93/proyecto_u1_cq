package com.uce.edu.demo.vuelo.repo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ConexionDBRepoImpl implements IConexionDBRepo{

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectando a base de datos: SINGLETON");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Desconectando...");
	}

}
