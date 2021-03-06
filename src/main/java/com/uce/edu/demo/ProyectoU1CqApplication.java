package com.uce.edu.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.matricula.Matricula;
import com.uce.edu.demo.matriculacion.vehicular.MatriculacionVehicular;
import com.uce.edu.demo.veterinaria.Veterinaria;

@SpringBootApplication
public class ProyectoU1CqApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ProyectoU1CqApplication.class);

//	@Autowired
//	private CitaMedica citaM ;

	@Autowired
	private CitaMedica2 citaM;

	@Autowired
	private Veterinaria veterinaria;

	@Autowired
	private Matricula matricula;
	
	@Autowired
	private MatriculacionVehicular matriculacionVehi;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		LOG.info("Mi primer proyecto con Spring Framework");
//	
//	String resp =  this.citaM.agendar(LocalDateTime.of(2022, Month.JUNE,2,15,0), "Cristian", "Quizhpe", 25, "Quito", "Paula", 20);
//	
//	System.out.println(resp);

		// tarea 5

		//primer ejemplo
		
		// String reg= veterinaria.registrarMascota("Rex", 2,1,"pitbull","Azul");

		// System.out.println(reg);

		//segundo ejemplo
		//System.out.println(this.matricula.matricular("Joyan", "1725487985", "Quimica", 6));
		
		//Tercer ejemplo
		
		System.out.println(this.matriculacionVehi.matricularVehiculo("VMW", "LGF-2155", "Manuel", "Medina", "1754879852"));

	}

}
