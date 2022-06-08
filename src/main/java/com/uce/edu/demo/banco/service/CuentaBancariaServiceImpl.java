package com.uce.edu.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepo cbRepo;
	
	@Override
	public void insertar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cbRepo.actualizar(cuenta);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.cbRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

}
