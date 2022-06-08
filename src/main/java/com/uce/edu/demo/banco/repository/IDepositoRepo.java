package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepo {

	
	void insertar(Deposito deposito);
	void actualizar(Deposito deposito);
	
	Deposito buscar(LocalDateTime fecha);
	
	void eliminar(LocalDateTime fecha);
	
}
