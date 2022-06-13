package com.uce.edu.demo.santamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.santamaria.to.ReporteProdTo;

public interface IGestorInventarioService {

	
	
	void registrarProducto(String nombre, String codigo, BigDecimal precio);
	
	void insertarInventario(Integer cantidad, LocalDateTime fechaIngreso, String codProducto);
	
	
	List<ReporteProdTo> generarReporte(LocalDateTime fechaIngreso);
}
