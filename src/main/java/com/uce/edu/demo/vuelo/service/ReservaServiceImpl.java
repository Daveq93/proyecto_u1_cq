package com.uce.edu.demo.vuelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vuelo.modelo.Reserva;
import com.uce.edu.demo.vuelo.repo.IReservaRepo;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	private IReservaRepo reservaRepo;

	@Override
	public void insertarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		this.reservaRepo.insertar(reserva);
	}

	@Override
	public void actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		this.reservaRepo.actualizar(reserva);
	}

	@Override
	public Reserva buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub

		return this.reservaRepo.buscar(codigo);
	}

	@Override
	public void eliminarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		this.reservaRepo.eliminar(codigo);
	}

}
