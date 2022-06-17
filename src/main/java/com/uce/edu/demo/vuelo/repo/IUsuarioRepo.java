package com.uce.edu.demo.vuelo.repo;

import com.uce.edu.demo.vuelo.modelo.Usuario;

public interface IUsuarioRepo {

	void insertar (Usuario usuario);
	void actualizar(Usuario usuario);
	Usuario buscar (String cedula);
	void eliminar(String cedula);
	
	
	
}
