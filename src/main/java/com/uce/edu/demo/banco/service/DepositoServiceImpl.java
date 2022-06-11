package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepo;

@Service
public class DepositoServiceImpl implements IDepositoService{

	@Autowired
	private IDepositoRepo depositoRepo;
	
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;

	@Override
	public void registrarDeposito(String numeroCuenta, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta = this.cuentaBancariaService.buscarPorNumero(numeroCuenta);
		
		cuenta.setSaldo(cuenta.getSaldo().add(monto));
		this.cuentaBancariaService.actualizarCuentaBancaria(cuenta);
		
		Deposito d = new Deposito();
		d.setFecha(LocalDateTime.now());
		d.setMonto(monto);
		d.setNumeroCuenta(cuenta.getNumero());
		
		this.depositoRepo.insertar(d);
	}

	@Override
	public void actualizarDeposito(Deposito deposito) {
		// TODO Auto-generated method stub
		this.depositoRepo.actualizar(deposito);
	}

	@Override
	public Deposito buscarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.depositoRepo.buscar(fecha);
		return null;
	}

	@Override
	public void eliminarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.depositoRepo.eliminar(fecha);
	}


	
	

}
