package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Factura;
@Repository
public class FacturaRepositoryImpl implements IFacturaRepository{
 public static List<Factura> baseDeDatos= new ArrayList<>();
	@Override
	public void insertar(Factura factura) {
		baseDeDatos.add(factura);
		
	}

}
