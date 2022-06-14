package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("corriente")
public class CuentaBancariaCorrienteServiceImpl implements ICuentaBancariaService{

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
	public BigDecimal calcularInteres(String numeroCuenta,BigDecimal saldo) {
		// TODO Auto-generated method stub
		//Codigo duplicado lo solucionamos con una Fachada (Gestor)
		//CuentaBancaria cb = this.cuentaBancariaRepo.buscar(numeroCuenta);
	//	BigDecimal saldo =null;
		BigDecimal interes = saldo.multiply(new BigDecimal(0.15));
		
		
		return interes;
	}

}
