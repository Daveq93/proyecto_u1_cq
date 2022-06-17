package com.uce.edu.demo.vuelo.repo;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vuelo.modelo.Usuario;

@Repository
public class UsuarioRepoImpl implements IUsuarioRepo{

	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		System.out.println("Insertando usuario");
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando usuario");
	}

	@Override
	public Usuario buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Buscando usuario con cedula: "+cedula);
		return null;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Eliminar usuario concedula: "+cedula);
	}

}
