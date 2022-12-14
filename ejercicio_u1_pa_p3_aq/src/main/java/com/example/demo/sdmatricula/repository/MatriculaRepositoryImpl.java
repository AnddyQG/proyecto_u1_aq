package com.example.demo.sdmatricula.repository;

import java.math.BigDecimal;



public class MatriculaRepositoryImpl implements IMatriculaRepository{

	public  BigDecimal valorm;
	@Override
	
	public void valor(String tipo) {
		
		System.out.println("Calculando el valor de la matricula");
	}

}
