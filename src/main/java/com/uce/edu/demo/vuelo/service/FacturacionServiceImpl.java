package com.uce.edu.demo.vuelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vuelo.modelo.Facturacion;
import com.uce.edu.demo.vuelo.repo.IFacturacionRepo;

@Service
public class FacturacionServiceImpl  implements IFacturacionService{

	@Autowired
	private IFacturacionRepo factRepo;
	
	@Override
	public void insertarFactura(Facturacion facturacion) {
		// TODO Auto-generated method stub
		this.factRepo.insertar(facturacion);
	}

	@Override
	public void actualizarFactura(Facturacion facturacion) {
		// TODO Auto-generated method stub
		this.factRepo.actualizar(facturacion);
	}

	@Override
	public Facturacion buscarPorNumeroFact(String numFactura) {
		// TODO Auto-generated method stub
		this.factRepo.buscar(numFactura);
		return null;
	}

	@Override
	public void eliminarPorNumFact(String numFactura) {
		// TODO Auto-generated method stub
		this.factRepo.eliminar(numFactura);
		}

}
