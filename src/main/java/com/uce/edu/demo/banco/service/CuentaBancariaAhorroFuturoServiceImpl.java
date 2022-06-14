package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("afuturo")
public class CuentaBancariaAhorroFuturoServiceImpl implements ICuentaBancariaService {

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarPorNumero(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCuenta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		System.out.println("Calculando interes de cuenta ahorro futuro ...");
		BigDecimal interes = new BigDecimal(560).multiply(new BigDecimal(0.25));
		return interes.add(saldo.divide(new BigDecimal(100)));
	}

}
