package com.uce.edu.demo.santamaria.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.repo.IInventarioRepo;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepo inventarioRepo;
	
	@Override
	public void insertarInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepo.insertar(inventario);
	}

	@Override
	public Inventario buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		this.inventarioRepo.buscar(codigo);
		return null;
	}

	@Override
	public void actualizarInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepo.actualizar(inventario);
	}

	@Override
	public void eliminarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		this.inventarioRepo.eliminar(codigo);
	}

	@Override
	public List<Inventario> buscarInventarioPorfecha(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		return this.inventarioRepo.buscarPorFecha(fechaIngreso);
	}

}
