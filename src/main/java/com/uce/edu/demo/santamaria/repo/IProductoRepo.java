package com.uce.edu.demo.santamaria.repo;

import java.util.List;

import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IProductoRepo {

	void insertar(Producto producto);

	void actualizar(Producto producto);

	Producto buscar(String codigo);

	void eliminar(String codigo);
	
	List<Producto> listarProductos();

}
