package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepoImpl implements IDepositoRepo {

	@Override
	public void insertar(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito de: "+deposito.toString());
	}

	@Override
	public void actualizar(Deposito deposito) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando deposito: "+deposito.toString());
	}

	@Override
	public Deposito buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Buscando deposito por fecha: "+fecha);
		return null;
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando deposito por fecha: "+fecha);
	
	}

	@Override
	public List<Deposito> consulta(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		List<Deposito> listaDepositos = new ArrayList<>();
		
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, Month.JANUARY,1,15,0));
		depo1.setMonto(new BigDecimal(500));
		depo1.setNumeroCuenta(cuenta);
		
		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, Month.JANUARY,1,15,0));
		depo2.setMonto(new BigDecimal(600));
		depo2.setNumeroCuenta(cuenta);
		
		listaDepositos.add(depo1);
		listaDepositos.add(depo2);
		
		return listaDepositos;
	}

}
