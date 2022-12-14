package com.example.demo.sdmatricula.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.sdmatricula.modelo.Vehiculo;
import com.example.demo.sdmatricula.repository.MatriculaRepositoryImpl;
import com.example.demo.sdmatricula.repository.VehiculoRepositoryImpl;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
@Autowired
MatriculaRepositoryImpl matriculaRepositoryImpl= new MatriculaRepositoryImpl();
@Autowired
VehiculoRepositoryImpl vehiculoRepositoryImpl = new VehiculoRepositoryImpl();

@Override
	public void valor(String tipo) {
	BigDecimal precioi;
	BigDecimal preciol;
	BigDecimal pesadop= BigDecimal.valueOf(0.15);
	BigDecimal pesadol= BigDecimal.valueOf(0.10);
		Vehiculo vehiculo= new Vehiculo();
		if(tipo.equals("pesado")) {
			precioi= vehiculo.getPrecio().multiply(pesadop);
			matriculaRepositoryImpl.valorm=precioi;
		}
		if(tipo.equals("liviano")) {
			preciol = vehiculo.getPrecio().multiply(pesadol);
			matriculaRepositoryImpl.valorm=preciol;
		}
	}

}
