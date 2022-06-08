package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ICuentaBancariaService cuentaBancService;

	@Autowired
	private ITransferenciaRepo transferenciaRepo;

	@Override
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancaria ctaOrigen = this.cuentaBancService.buscar(cuentaOrigen);
		CuentaBancaria ctaDestino = this.cuentaBancService.buscar(cuentaDestino);

		BigDecimal nuevoSaldoOrigen = ctaOrigen.getSaldo().subtract(monto);
		BigDecimal nuevoSaldoDestino = ctaDestino.getSaldo().add(monto);

		ctaOrigen.setSaldo(nuevoSaldoOrigen);
		ctaDestino.setSaldo(nuevoSaldoDestino);

		this.cuentaBancService.actualizar(ctaOrigen);
		this.cuentaBancService.actualizar(ctaDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaDestino(ctaDestino.getNumero());
		t.setNumeroCuentaOrigen(ctaOrigen.getNumero());
		t.setMontoTransferir(monto);
		t.setFecha(LocalDateTime.now());

		this.transferenciaRepo.insertar(t);
	}

}
