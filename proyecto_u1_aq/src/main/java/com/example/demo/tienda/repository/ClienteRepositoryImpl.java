package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.tienda.modelo.Cliente;
@Repository
public class ClienteRepositoryImpl implements IClienteRepository	{

	
	private static List<Cliente> baseDeDatos= new ArrayList<>();
	
	
	@Override
	public void insertar(Cliente cliente) {
		baseDeDatos.add(cliente);
		
	}

	@Override
	public void actualziar(Cliente cliente) {
		//update en base de datos
		
				Cliente cli = null;
				for(Cliente c: baseDeDatos) {
					if(c.getCedula().equals(cliente.getCedula())) {
						cli=c;
						
						
					}
						
						
					}
				baseDeDatos.remove(cli);
				baseDeDatos.add(cliente);
				
			
		}

	@Override
	public Cliente buscar(String cedula) {
	Cliente cli = null;
	for(Cliente c:baseDeDatos) {
		if(c.getCedula().equals(cedula)) {
			cli=c;
		}
	}
	return cli;
	}

	@Override
	public void eliminar(String cedula) {
		Cliente cli=buscar(cedula);
		baseDeDatos.remove(cli);
		
	}

}
