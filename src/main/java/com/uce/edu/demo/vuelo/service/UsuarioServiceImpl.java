package com.uce.edu.demo.vuelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vuelo.modelo.Usuario;
import com.uce.edu.demo.vuelo.repo.IConexionDBRepo;
import com.uce.edu.demo.vuelo.repo.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IConexionDBRepo conexionRepo;
	
	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	@Override
	public void insertarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioRepo.insertar(usuario);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioRepo.actualizar(usuario);
	}

	@Override
	public Usuario buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		this.conexionRepo.conectar();
		
		this.usuarioRepo.buscar(cedula);
		return null;
	}

	@Override
	public void eliminarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		this.usuarioRepo.eliminar(cedula);
	}

}
