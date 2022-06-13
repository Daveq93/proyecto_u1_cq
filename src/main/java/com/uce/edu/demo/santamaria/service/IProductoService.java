package com.uce.edu.demo.santamaria.service;

import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IProductoService {
	void insertarProducto(Producto producto);

	void actualizarProducto(Producto producto);

	Producto buscarPorCodigo(String codigo);

	void eliminarPorCodigo(String codigo);
}
