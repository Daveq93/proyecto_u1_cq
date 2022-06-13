package com.uce.edu.demo.santamaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.repo.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo productoRepo;
	
	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertar(producto);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizar(producto);
	}

	@Override
	public Producto buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		
		return this.productoRepo.buscar(codigo);
	}

	@Override
	public void eliminarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		this.productoRepo.eliminar(codigo);
	}

}
