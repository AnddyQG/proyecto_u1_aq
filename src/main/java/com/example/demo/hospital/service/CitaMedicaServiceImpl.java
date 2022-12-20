package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.CitaMedica;
import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.repository.ICitaMedicaRepository;
import com.example.demo.hospital.repository.IMedicoRepository;
import com.example.demo.hospital.repository.IPacienteRepository;


@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Autowired
	private IMedicoRepository iMedicoRepository;


	@Override
	public void agendar(String cm , String cp ) {
		// TODO Auto-generated method stub
		Paciente p = this.iPacienteRepository.buscar(cm);
	    Medico m = this.iMedicoRepository.buscar(cp);
		CitaMedica citaMedica1 = new CitaMedica();
		
		
			System.out.println("Agendando: ");
			

			citaMedica1.setPaciente(p);
			citaMedica1.setMedico(m);
			this.citaMedicaRepository.agregar(citaMedica1);
			
	
		
		
	}
	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
        CitaMedica citaMedica = null;
		
		if (this.citaMedicaRepository.buscar(numero)!= null) {
			citaMedica = this.citaMedicaRepository.buscar(numero);
		}else System.out.println("no encontro la cita ");
		return citaMedica;
		
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		
	}

}
