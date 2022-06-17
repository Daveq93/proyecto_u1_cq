package com.uce.edu.demo.vuelo.modelo;

import java.math.BigDecimal;

public class Facturacion {

	
	private String numFactura;
	private BigDecimal total;
	private Usuario user;
	private String numTarjeta;
	
	
	
	
	
	@Override
	public String toString() {
		return "Facturacion [numFactura=" + numFactura + ", total=" + total + ", user=" + user + ", numTarjeta="
				+ numTarjeta + "]";
	}
	
	
	//set and get
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	
	public BigDecimal getTotal() {
		return total;
	}


	public void setTotal(BigDecimal total) {
		this.total = total;
	}


	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public String getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	
	
}
