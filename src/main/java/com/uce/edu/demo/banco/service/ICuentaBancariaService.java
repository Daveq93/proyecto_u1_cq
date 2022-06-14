package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	void insertarCuentaBancaria(CuentaBancaria cuenta);
	void actualizarCuentaBancaria(CuentaBancaria cuenta);
	CuentaBancaria buscarPorNumero(String numero);
	void eliminarPorNumero(String numero);
	
	 BigDecimal calcularInteres(String numeroCuenta,BigDecimal saldo);
	
}
