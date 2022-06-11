package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepo {
	
	void insertar(Transferencia transferencia);
	void actualizar(Transferencia transferencia);
	Transferencia buscar(LocalDateTime fecha);
	void eliminar(LocalDateTime fecha);
	
	List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro);
	
}
