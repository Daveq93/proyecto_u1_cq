package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepoImpl implements IRetiroRepo{

	@Override
	public void insertar(Retiro retiro) {
		// TODO Auto-generated method stub
		System.out.println("Insertando retiro: "+retiro.toString());
	}

	@Override
	public Retiro buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Buscando retiro por fecha: "+fecha);
		return null;
	}

	@Override
	public void actualizar(Retiro retiro) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando retiro: "+retiro.toString());
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando retiro por fecha: "+fecha);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		List<Retiro> listaConsultada = new ArrayList<>();
		Retiro ret = new Retiro();
		ret.setFecha(LocalDateTime.of(2020, Month.APRIL,10,15,12));
		ret.setMonto(new BigDecimal (120));
		ret.setNumeroCuenta(cuenta);
		
		listaConsultada.add(ret);
		return listaConsultada;
	}

}
