package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepo {

	void insertar(Retiro retiro);
	Retiro buscar(LocalDateTime fecha);
	void actualizar(Retiro retiro);
	void eliminar(LocalDateTime fecha);
	
}
