package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepo;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepo cuentaBancRepo;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService cuentaBancariaService;
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService cuentaBancariaServiceA;
	
	
	@Override
	public BigDecimal calcularInteres(String numCuenta) {
		// TODO Auto-generated method stub
		BigDecimal interes =null;
		CuentaBancaria cb = this.cuentaBancRepo.buscar(numCuenta);
		
		if(cb.getTipo().equals("A")) {
			//Ahorros
			interes = this.cuentaBancariaServiceA.calcularInteres(numCuenta, cb.getSaldo());
		}else {
			//Corriente
			interes = this.cuentaBancariaService.calcularInteres(numCuenta, cb.getSaldo());
		}
		
		return interes;
	}

}
