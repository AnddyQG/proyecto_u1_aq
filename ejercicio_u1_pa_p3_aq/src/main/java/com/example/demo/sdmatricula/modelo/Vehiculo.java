package com.example.demo.sdmatricula.modelo;

import java.math.BigDecimal;

public class Vehiculo {
private String marca;
private String placa;
private String tipo;
private BigDecimal Precio;


@Override
public String toString() {
	return "Vehiculo [marca=" + marca + ", placa=" + placa + ", tipo=" + tipo + ", Precio=" + Precio + "]";
}




//getters y setters


public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public BigDecimal getPrecio() {
	return Precio;
}
public void setPrecio(BigDecimal precio) {
	Precio = precio;
}





}
