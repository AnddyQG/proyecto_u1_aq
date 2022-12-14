package com.example.demo.tienda.repository;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteRepository {

	
	//CRUD
	
	public void insertar(Cliente cliente);
	
	public void actualziar(Cliente cliente);
	
	public Cliente buscar(String cedula);
	
	public void eliminar(String cedula);
}
