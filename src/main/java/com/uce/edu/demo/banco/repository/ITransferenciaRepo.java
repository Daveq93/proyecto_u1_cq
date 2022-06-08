package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepo {
	
	void insertar(Transferencia transferencia);
	void actualizar(Transferencia transferencia);
	Transferencia buscar(LocalDateTime fecha);
	void eliminar(LocalDateTime fecha);
	
}
