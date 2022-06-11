package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	
	void actualizarTransferencia(Transferencia transferencia);
	
	Transferencia buscarPorFecha(LocalDateTime fecha);
	
	void eliminarPorFecha(LocalDateTime fecha);
	
	
	
}
