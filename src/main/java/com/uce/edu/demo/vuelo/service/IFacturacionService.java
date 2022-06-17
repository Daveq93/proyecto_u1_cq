package com.uce.edu.demo.vuelo.service;

import com.uce.edu.demo.vuelo.modelo.Facturacion;

public interface IFacturacionService {
	void insertarFactura(Facturacion facturacion);

	void actualizarFactura(Facturacion facturacion);

	Facturacion buscarPorNumeroFact(String numFactura);

	void eliminarPorNumFact(String numFactura);
}
