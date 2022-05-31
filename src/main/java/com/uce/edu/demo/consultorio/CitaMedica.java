package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CitaMedica {

	//@Autowired
	private Doctor doctor;
	//@Autowired
	private Paciente paciente;
	
	private LocalDateTime fechaCita;

	//2. inyeccion de depencias por contructor
	public CitaMedica(Doctor doctor, Paciente paciente) {
		this.doctor=doctor;
		this.paciente=paciente;
		
	}
	
	
	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, Integer edad, String ciudad,
			String nombrePaciente, Integer edadPaciente) {

		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setNombre(nombrePaciente);
		this.paciente.setEdad(edadPaciente);
		
		this.fechaCita=fechaCita;
		// se einderta la cita en la base de datos
		return "Cita agendada";
	}

	
	
	
	
	@Override
	public String toString() {
		return "CitaMedica [doctor=" + doctor + ", paciente=" + paciente + ", fechaCita=" + fechaCita + "]";
	}





	// set y get
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
