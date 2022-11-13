package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paceinte;

	public void agendar(String numero, LocalDateTime fechaCita, String nombreMedico, String cedulaMedico,
			String nombrePaciente, String cedulaPaciente) {
		this.numero=numero;
		this.fechaCita=fechaCita;
		Medico medicoObj = new Medico();
		medicoObj.setCedula(cedulaMedico);
		medicoObj.setNombre(nombreMedico);
		this.medico=medicoObj;
		
		Paciente pacienteObj = new Paciente();
		pacienteObj.setCedula(cedulaPaciente);
		pacienteObj.setNombre(nombrePaciente);
		this.paceinte= pacienteObj;

	}

	// getters and setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaceinte() {
		return paceinte;
	}

	public void setPaceinte(Paciente paceinte) {
		this.paceinte = paceinte;
	}

}
