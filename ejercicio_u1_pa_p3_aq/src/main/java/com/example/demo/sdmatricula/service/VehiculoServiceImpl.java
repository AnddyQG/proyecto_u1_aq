package com.example.demo.sdmatricula.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.sdmatricula.modelo.Vehiculo;

import com.example.demo.sdmatricula.repository.VehiculoRepositoryImpl;
@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	VehiculoRepositoryImpl vehiculoRepositoryImpl = new VehiculoRepositoryImpl();
	
	private static List<Vehiculo> baseVehiculos= new ArrayList<>();


	@Override
	public void Eliminar(String placa) {
		
		
	}

	@Override
	public Vehiculo Actualizar(String placa) {
		Vehiculo vehiculo= new Vehiculo();
		String marca=null;
		String tipo=null;
		BigDecimal precio=null;
		if(vehiculo.getPlaca().equals(placa)) {
			vehiculo.setPlaca(placa);
			vehiculo.setMarca(marca);
			vehiculo.setTipo(tipo);
			vehiculo.setPrecio(precio);
		}
		baseVehiculos.add(vehiculo);
		return vehiculo;
	}

	@Override
	public Vehiculo Crear(String marca, String placa, String tipo, BigDecimal precio) {
		Vehiculo vehiculo= new Vehiculo();
		return vehiculo;
		
		
	}





	

}
