package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	void insertarRetiro(String cuentaOrigen,BigDecimal monto);
	Retiro buscarPorFecha(LocalDateTime fecha);
	void actualizarRetiro(Retiro retiro);
	void eliminarPorFecha(LocalDateTime fecha);
	
	
}
