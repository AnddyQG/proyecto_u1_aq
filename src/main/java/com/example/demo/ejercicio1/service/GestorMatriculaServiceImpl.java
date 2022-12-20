package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Qualifier("liviano")
@Autowired
private IMatriculaNuevaService iMatriculaNuevaServiceLiviano;

@Qualifier("pesado")
@Autowired
private IMatriculaNuevaService iMatriculaNuevaServiceLiviano;



@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService{

	@Override
	public void matricular(String cedula, String placa) {
		
		
		 if(vehi.getTipo().equals("P")) {
	    	  this.iMatriculaService.matricular("1241241241", "PSGD2312");
	    	  
	      }else {
	    	  this.iMatriculaNuevaServiceLiviano.matricular("1241241241", "PSGD2312");
	      }
		
	}

}
