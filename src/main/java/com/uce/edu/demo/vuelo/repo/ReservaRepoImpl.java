package com.uce.edu.demo.vuelo.repo;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vuelo.modelo.Reserva;
import com.uce.edu.demo.vuelo.modelo.Usuario;

@Repository
public class ReservaRepoImpl implements IReservaRepo{

	@Override
	public void insertar(Reserva reserva) {
		// TODO Auto-generated method stub
		System.out.println("Insertando reserva");
	}

	@Override
	public void actualizar(Reserva reserva) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando reserva");
	}

	@Override
	public Reserva buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por codigo");
		Usuario u = new Usuario();
		u.setCedula("124548787");
		u.setNombre("Carlos");
		
		Reserva r = new Reserva();
		r.setAerolinea("Tame");
		r.setAsientoNum(125);
		r.setCodigo("1284sd");
		r.setPrecio(new BigDecimal(125));
		r.setUser(u);
		return r;
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando reserva por codigo");
	}

}
