package com.example.demo.sdmatricula.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.sdmatricula.modelo.Propietario;
import com.example.demo.sdmatricula.repository.PropietarioRepositoryImpl;
@Service
public class PropietarioServiceImpl implements IPropietarioService{
	@Autowired
	PropietarioRepositoryImpl repositoryImpl = new PropietarioRepositoryImpl();
	private static List<Propietario> basePropietario = new ArrayList<>();
	@Override
	public Propietario Crear(Propietario propietario) {
		propietario.getNombre();
		propietario.getApellido();
		propietario.getCedula();
		propietario.getFechanacimiento();
		repositoryImpl.crear(propietario);
		return propietario;
	}

}
