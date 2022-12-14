package com.example.demo.sdmatricula.repository;

import java.util.ArrayList;
import java.util.List;


import com.example.demo.sdmatricula.modelo.Propietario;

public class PropietarioRepositoryImpl implements IPropietarioRepository{
	private static List<Propietario> basePropietario = new ArrayList<>();
	@Override
	public void crear(Propietario propietario) {
	System.out.println("Se ha creado un vehiculo");
		
	}

}
