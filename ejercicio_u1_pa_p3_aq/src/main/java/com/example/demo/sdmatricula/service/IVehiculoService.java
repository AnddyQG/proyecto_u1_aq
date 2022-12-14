package com.example.demo.sdmatricula.service;

import java.math.BigDecimal;

import com.example.demo.sdmatricula.modelo.Vehiculo;

public interface IVehiculoService {

	Vehiculo Crear(String marca,String placa, String tipo, BigDecimal precio);
	public void Eliminar(String placa);
	Vehiculo Actualizar(String placa);
	

}
