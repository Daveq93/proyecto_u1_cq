package com.uce.edu.demo.vuelo.service;

import java.math.BigDecimal;

import com.uce.edu.demo.vuelo.modelo.Reserva;

public interface IGestorSunTravelService {

	void realizarReserva(String codigo, String aerolinea, Integer asientoNum, BigDecimal precio, String nombreUsuario,
			String cedulaUsuario);

	
	void realizarFacturacion(String codigo, String numTarjeta);
}
