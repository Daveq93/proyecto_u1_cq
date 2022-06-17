package com.uce.edu.demo.vuelo.modelo;

import java.math.BigDecimal;

public class Reserva {

	private String codigo;
	private String aerolinea;
	private Integer asientoNum;
	private BigDecimal precio;
	private Usuario user;
	
	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", aerolinea=" + aerolinea + ", asientoNum=" + asientoNum + ", precio="
				+ precio + ", user=" + user + "]";
	}
	
	//set and get
	public String getAerolinea() {
		return aerolinea;
	}
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public Integer getAsientoNum() {
		return asientoNum;
	}
	public void setAsientoNum(Integer asientoNum) {
		this.asientoNum = asientoNum;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
	
}
