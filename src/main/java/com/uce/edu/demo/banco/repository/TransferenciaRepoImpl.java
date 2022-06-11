package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepoImpl implements ITransferenciaRepo{

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("Realizando proceso  de transferencia (Repository): "+transferencia.toString());
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando Transferencia: "+transferencia.toString());
	}

	@Override
	public Transferencia buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por fecha de transferencia: "+fecha);
		return null;
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando transferencia por fecha");
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		//se debe construir el SQL que retornara la lista de la base de datos
		List<Transferencia> listaConsultada = new ArrayList<>();
		Transferencia t1 = new Transferencia();
		t1.setFecha(LocalDateTime.now());
		t1.setMontoTransferir(new BigDecimal(100));
		t1.setNumeroCuentaOrigen("12345");
		t1.setNumeroCuentaDestino("7896");
		listaConsultada.add(t1);
		return listaConsultada;
	}

}
