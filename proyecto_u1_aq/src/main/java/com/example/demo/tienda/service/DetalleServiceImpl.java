package com.example.demo.tienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Detalle;
@Service
public class DetalleServiceImpl implements IDetalleService{
public static List<Detalle> baseDeDatos= new ArrayList<>();
	@Override
	public void insertar(Detalle detalle) {
		baseDeDatos.add(detalle);
		
	}

}
