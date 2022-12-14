package com.example.demo.sdmatricula.repository;

import java.util.ArrayList;
import java.util.List;


import com.example.demo.sdmatricula.modelo.Vehiculo;

public class VehiculoRepositoryImpl implements IVehiculoRepository{
	private static List<Vehiculo> baseVehiculos= new ArrayList<>();
	@Override
	public void Crear(Vehiculo vehiculo) {
		System.out.println("Se ha creado el vehiculo");
		baseVehiculos.add(vehiculo);
		
	}

	@Override
	public void Eliminar(String placa) {
		System.out.println("Se ha eliminado el vehiculo");
		
	}

	@Override
	public void Actualizar(Vehiculo vehiculo) {
		System.out.println("Se ha actualizado el vehiculo");
		
	}
	
	
	

}
