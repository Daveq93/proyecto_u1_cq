package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {

	void insertar(CuentaBancaria cuenta);
	void actualizar(CuentaBancaria cuenta);
	CuentaBancaria buscar(String numero);
	void eliminar(String numero);
	
}
