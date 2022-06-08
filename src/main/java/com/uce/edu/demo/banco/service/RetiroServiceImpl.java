package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepo;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private IRetiroRepo retiroRepo;
	
	@Autowired
	private ICuentaBancariaService cuentaBancService;
	
	@Override
	public void insertarRetiro(String cuentaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		CuentaBancaria ctaOrigen = this.cuentaBancService.buscarPorNumero(cuentaOrigen);
		
		
		ctaOrigen.setSaldo(ctaOrigen.getSaldo().subtract(monto));
		
		this.cuentaBancService.actualizarCuentaBancaria(ctaOrigen);
		Retiro r = new Retiro();
		r.setMonto(monto);
		r.setNumeroCuenta(ctaOrigen.getNumero());
		r.setFecha(LocalDateTime.now());
		
		this.retiroRepo.insertar(r);
	}

	@Override
	public Retiro buscarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.retiroRepo.buscar(fecha);
		return null;
	}

	@Override
	public void actualizarRetiro(Retiro retiro) {
		// TODO Auto-generated method stub
		this.retiroRepo.actualizar(retiro);
	}

	@Override
	public void eliminarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.retiroRepo.eliminar(fecha);
	}

}
