package com.example.demo.tienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;
@Service
public class ClienteServiceImpl implements IClienteService{
 public static List<Cliente> baseDeDatos= new ArrayList<>();
@Autowired
 private IClienteRepository clienteRepository;	
 @Override
	public void agregar(Cliente cliente) {
		this.clienteRepository.insertar(cliente);
		
	}

	
}
