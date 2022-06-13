package com.uce.edu.demo.santamaria.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.santamaria.modelo.Inventario;

public interface IInventarioService {
	void insertarInventario(Inventario inventario);

	Inventario buscarPorCodigo(String codigo);

	void actualizarInventario(Inventario inventario);

	void eliminarPorCodigo(String codigo);
	
	List<Inventario> buscarInventarioPorfecha(LocalDateTime fechaIngreso);

}
