package com.uce.edu.demo.vuelo.repo;

import com.uce.edu.demo.vuelo.modelo.Facturacion;

public interface IFacturacionRepo {
	void insertar(Facturacion facturacion);

	void actualizar(Facturacion facturacion);

	Facturacion buscar(String numFactura);

	void eliminar(String numFactura);

}
