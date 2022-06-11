package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.to.TransaccionTo;

public interface ITransaccionService {


	void transferencia(String origen, String destino, BigDecimal monto);
	void deposito(String destino,BigDecimal monto);
	void retiro(String ctaRetiro,BigDecimal monto);
	
	List<TransaccionTo> conultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFinal);

}
