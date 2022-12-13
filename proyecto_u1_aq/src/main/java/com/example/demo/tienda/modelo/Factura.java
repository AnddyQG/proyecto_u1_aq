package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Factura {
private String numero;
	private Cliente cliente;
	private LocalDateTime fecha;
	private List<Detalle> detalles;
	private BigDecimal total;
	private BigDecimal subTotal;
	private BigDecimal iva;
	
	
	
	//getters y setters
	
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", cliente=" + cliente + ", fecha=" + fecha + ", detalles=" + detalles
				+ ", total=" + total + ", subTotal=" + subTotal + ", iva=" + iva + "]";
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public BigDecimal getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}
	public BigDecimal getIva() {
		return iva;
	}
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}
	
	
	
}
