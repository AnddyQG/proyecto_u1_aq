package com.example.demo.hospital.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.Medico;

@Repository
public class MedicoRepositoryImpl implements IMedicoRepository{

	private static List<Medico> baseDeDatos = new ArrayList<>();
	
	@Override
	public void crear(Medico medico) {
		// TODO Auto-generated method stub
		baseDeDatos.add(medico);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		baseDeDatos.remove(this.buscar(cedula));
	}

	@Override
	public Medico buscar(String cedula) {
		// TODO Auto-generated method stub
		Medico medicoa = null;
		
		for (Medico medico1 : baseDeDatos) {
			if (medico1.getCedula().equals(cedula)) {
				medicoa = medico1;
			}
		}
		return medicoa;
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
	Medico medicob = null;
		
		for (Medico medico2 : baseDeDatos) {
			if (medicob.getCedula().equals(medico.getCedula())) {
				medicob = medico2;
			}
		}
		baseDeDatos.remove(medicob);
		baseDeDatos.add(medico);
		
		
	}

}
