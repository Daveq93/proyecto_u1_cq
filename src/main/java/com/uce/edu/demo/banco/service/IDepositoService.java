package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

public interface IDepositoService {

	void registrarDeposito(String numeroCuenta, BigDecimal monto);
}
