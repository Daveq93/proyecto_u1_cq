package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepo {

	
	void insertar(Deposito deposito);
	void actualizar(Deposito deposito);
	
	Deposito buscar(LocalDateTime fecha);
	
	void eliminar(LocalDateTime fecha);
	
	List<Deposito> consulta(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro);
	
}
