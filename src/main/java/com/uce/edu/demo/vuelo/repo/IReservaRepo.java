package com.uce.edu.demo.vuelo.repo;

import com.uce.edu.demo.vuelo.modelo.Reserva;

public interface IReservaRepo {

	
	void insertar(Reserva reserva);
	void actualizar(Reserva reserva);
	Reserva buscar(String codigo);
	void eliminar(String codigo);
}
