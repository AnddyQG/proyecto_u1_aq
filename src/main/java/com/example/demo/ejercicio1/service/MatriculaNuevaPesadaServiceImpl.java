package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("pesado")
public class MatriculaNuevaPesadaServiceImpl implements IMatriculaNuevaService{

	@Override
	public void matricular(String cedula, String placa) {
		System.out.println("MATRICULADO PESADO");
		System.out.println("Calculo del descuento de 2000");
		
	}

}
