package com.uce.edu.demo.banco.service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	void insertar(CuentaBancaria cuenta);
	void actualizar(CuentaBancaria cuenta);
	CuentaBancaria buscar(String numero);
	void eliminar(String numero);
	
}
