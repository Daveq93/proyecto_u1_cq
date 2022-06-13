package com.uce.edu.demo.santamaria.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.santamaria.modelo.Inventario;

public interface IInventarioRepo {

	void insertar(Inventario inventario);

	Inventario buscar(String codigo);

	void actualizar(Inventario inventario);

	void eliminar(String codigo);
	
	List<Inventario> buscarPorFecha(LocalDateTime fechaIngreso);

}
