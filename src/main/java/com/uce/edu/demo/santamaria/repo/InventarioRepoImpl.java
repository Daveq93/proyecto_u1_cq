package com.uce.edu.demo.santamaria.repo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.santamaria.modelo.Inventario;

@Repository
public class InventarioRepoImpl implements IInventarioRepo{

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("Insertando inventario: "+inventario.toString()+"\n");
	}

	@Override
	public Inventario buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por codigo de inventario: "+codigo);
		return null;
	}

	@Override
	public void actualizar(Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando inventario: "+inventario.toString());
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando inventario por codigo: "+codigo);
	}

	@Override
	public List<Inventario> buscarPorFecha(LocalDateTime fechaIngreso) {
		//aqui va el SQL para buscar inventarios por fecha de ingreso
		System.out.println("Buscando inventario por fecha de ingreso: ");
		return null;
	}



}
