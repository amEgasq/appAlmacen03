package com.mitienda.appAlmacen03.model;

public class Producto {

	private String nombre;
	private Double precio;
	private Integer cantidad;
	private Double descuento;
	private Double total;
	
	public Producto() {
	}
	
	public Producto(String nombre, Double precio, Integer cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", descuento="
				+ descuento + ", total=" + total + "]";
	}

}
