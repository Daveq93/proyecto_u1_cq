package com.uce.edu.demo.santamaria.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.to.ReporteProdTo;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Autowired
	private IProductoService productoService;

	@Autowired
	private IInventarioService inventarioService;

	//lista para simular el registro del inventario
	List<Inventario> listaInv=new ArrayList<>();
	
	@Override
	public void registrarProducto(String nombre, String codigo, BigDecimal precio) {

		Producto p = new Producto();
		p.setCodigo(codigo);
		p.setNombre(nombre);
		p.setPrecio(precio);

		BigDecimal pv = p.getPrecio().add(p.getPrecio().multiply(new BigDecimal(0.10)))
				.add(p.getPrecio().multiply(new BigDecimal(0.12)));

		p.setPrecioVenta(pv.setScale(2, RoundingMode.HALF_UP));
		
		
		this.productoService.insertarProducto(p);
	}

	@Override
	public void insertarInventario(Integer cantidad, LocalDateTime fechaIngreso, String codProducto) {

		Producto p = this.productoService.buscarPorCodigo("--cod--");// Busqueda para insertar al inventario un producto
																	// previamente guardado															// metodo de busqueda por codigo
																	// me devuelve el ultimo producto ingresado
		Inventario inv = new Inventario();
		inv.setCantidad(cantidad);
		inv.setCodigo("INV-2015");
		inv.setFechaIngreso(fechaIngreso);
		inv.setProducto(p);

		listaInv.add(inv);
		
		this.inventarioService.insertarInventario(inv);

	}

	@Override
	public List<ReporteProdTo> generarReporte(LocalDateTime fechaIngreso) {
		
		List<Inventario> inv = this.inventarioService.buscarInventarioPorfecha(fechaIngreso);//buscando por fecha de ingreso
		
		// utilizariamos la lista (inv) buscada en la base de datos
		//en este caso solo para prueba se uso la lista creada en esta clase (listaInv)
		
		List<ReporteProdTo> listaFinal = listaInv.stream().map(invent->{
			ReporteProdTo r = new ReporteProdTo();
			r.setCantidad(invent.getCantidad());
			r.setFechaIngreso(invent.getFechaIngreso());
			r.setNombre(invent.getProducto().getNombre());
			r.setPrecioVenta(invent.getProducto().getPrecioVenta());
			return r;
		}).collect(Collectors.toList());
		
		return listaFinal;
	}

}
