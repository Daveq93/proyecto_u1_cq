package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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

		CuentaBancaria ctaOrigen = this.cuentaBancService.buscarPorNumero(cuentaOrigen);
		CuentaBancaria ctaDestino = this.cuentaBancService.buscarPorNumero(cuentaDestino);

		BigDecimal nuevoSaldoOrigen = ctaOrigen.getSaldo().subtract(monto);
		BigDecimal nuevoSaldoDestino = ctaDestino.getSaldo().add(monto);

		ctaOrigen.setSaldo(nuevoSaldoOrigen);
		ctaDestino.setSaldo(nuevoSaldoDestino);

		this.cuentaBancService.actualizarCuentaBancaria(ctaOrigen);
		this.cuentaBancService.actualizarCuentaBancaria(ctaDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaDestino(ctaDestino.getNumero());
		t.setNumeroCuentaOrigen(ctaOrigen.getNumero());
		t.setMontoTransferir(monto);
		t.setFecha(LocalDateTime.now());

		this.transferenciaRepo.insertar(t);
	}

	@Override
	public void actualizarTransferencia(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepo.actualizar(transferencia);
	}

	@Override
	public Transferencia buscarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.transferenciaRepo.buscar(fecha);
		return null;
	}

	@Override
	public void eliminarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.transferenciaRepo.eliminar(fecha);
	}

	

}
