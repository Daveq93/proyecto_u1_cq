package com.uce.edu.demo.vuelo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.vuelo.modelo.Facturacion;
import com.uce.edu.demo.vuelo.modelo.Reserva;
import com.uce.edu.demo.vuelo.modelo.Usuario;
import com.uce.edu.demo.vuelo.repo.IConexionDBRepo;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GestorSunTravelServiceImpl implements IGestorSunTravelService {

	@Autowired
	private IConexionDBRepo conexionRepo;

	@Autowired
	private IUsuarioService userService;
	
	@Autowired
	private IReservaService reservaService;
	
	@Autowired
	private IFacturacionService factService;

	@Override
	public void realizarReserva(String codigo, String aerolinea, Integer asientoNum, BigDecimal precio,
			String nombreUsuario, String cedulaUsuario) {
		// TODO Auto-generated method stub
		this.conexionRepo.conectar();
		/* Usuario user = */ this.userService.buscarPorCedula("45454"); // aqui busco el usuario registrado

		Usuario u1 = new Usuario();
		u1.setCedula(cedulaUsuario);
		u1.setNombre(nombreUsuario);

		Reserva r = new Reserva();
		r.setAerolinea(aerolinea);
		r.setAsientoNum(asientoNum);
		r.setCodigo(codigo);
		r.setPrecio(precio);
		r.setUser(u1);
		
		this.reservaService.insertarReserva(r);

	}

	

	@Override
	public void realizarFacturacion(String codigo, String numTarjeta) {
		// TODO Auto-generated method stub
		
		Reserva r = this.reservaService.buscarPorCodigo(codigo);
		System.out.println(r.toString());
	
		
		Facturacion f = new Facturacion();
		f.setNumFactura(r.getCodigo());
		f.setTotal(r.getPrecio());
		f.setUser(r.getUser());
		f.setNumTarjeta(numTarjeta);
		
		this.factService.insertarFactura(f);
		System.out.println("Factura realizada" + f.toString() );
	}

	
	
	
}
