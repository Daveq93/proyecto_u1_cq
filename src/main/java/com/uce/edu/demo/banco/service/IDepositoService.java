package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	void registrarDeposito(String numeroCuenta, BigDecimal monto);
	void actualizarDeposito(Deposito deposito);
	Deposito buscarPorFecha(LocalDateTime fecha);
	void eliminarPorFecha(LocalDateTime fecha);
	
}
