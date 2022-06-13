package com.uce.edu.demo.santamaria.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.santamaria.modelo.Producto;

@Repository
public class ProductoRepoImpl implements IProductoRepo{

	//lista usada para simular el registro en la base de datos
	private List<Producto> listaProducto = new ArrayList<>();
	
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		listaProducto.add(producto);
		System.out.println("Insertando producto en la base de datos: "+producto.toString());
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando producto: "+producto.toString());
	}

	@Override
	public Producto buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Buscando producto con codigo: "+codigo);
		return listaProducto.get(listaProducto.size()-1);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando producto: "+codigo);
	}

	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return listaProducto;
	}

}
