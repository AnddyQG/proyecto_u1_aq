package com.example.demo.tienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Producto;
@Service
public class ProductoServiceImpl implements IProductoService{
public static List<Producto> baseDeDatos= new ArrayList<>();
	@Override
	public void insertar(Producto producto) {
		baseDeDatos.add(producto);
		
	}

}
