package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	private String numeroCuenta;
	private LocalDateTime fecha;
	private BigDecimal monto;
	
	
	@Override
	public String toString() {
		return "Retiro[numeroCuenta=" + numeroCuenta + ", fecha=" + fecha + ", monto=" + monto + "]";
	}
	//set and get
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
}
