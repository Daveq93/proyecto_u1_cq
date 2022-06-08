package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	@Override
	public void insertar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		//Aqui realizamos los SQL para la interaccion con la base de datos
		System.out.println("Cuenta bancaria actualizada a: "+cuenta.toString());
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Buscando cuenta bancaria: "+numero);
		CuentaBancaria cb = new CuentaBancaria();
		cb.setNumero(numero);
		cb.setSaldo(new BigDecimal(100));
		return cb ;
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

}
