package com.uce.edu.demo.vuelo.repo;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vuelo.modelo.Facturacion;

@Repository
public class FacturacionRepoImpl implements IFacturacionRepo{

	@Override
	public void insertar(Facturacion facturacion) {
		// TODO Auto-generated method stub
		System.out.println("insertando factura... ");
	}

	@Override
	public void actualizar(Facturacion facturacion) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando... ");
	}

	@Override
	public Facturacion buscar(String numFactura) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por numero de factura ");
		return null;
	}

	@Override
	public void eliminar(String numFactura) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando por numero de factura ");
	}

}
