package com.uce.edu.demo.vuelo.service;

import com.uce.edu.demo.vuelo.modelo.Reserva;

public interface IReservaService {

	void insertarReserva(Reserva reserva);

	void actualizarReserva(Reserva reserva);

	Reserva buscarPorCodigo(String codigo);

	void eliminarPorCodigo(String codigo);

}
