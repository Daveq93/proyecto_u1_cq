package com.uce.edu.demo.vuelo.service;

import com.uce.edu.demo.vuelo.modelo.Usuario;

public interface IUsuarioService  {
	void insertarUsuario (Usuario usuario);
	void actualizarUsuario(Usuario usuario);
	Usuario buscarPorCedula (String cedula);
	void eliminarPorCedula(String cedula);
}
