package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.time.Month;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1CqApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ProyectoU1CqApplication.class);
	
//	@Autowired
//	private CitaMedica citaM ;
	
	@Autowired
	private CitaMedica2 citaM ;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Mi primer proyecto con Spring Framework");
	
	String resp =  this.citaM.agendar(LocalDateTime.of(2022, Month.JUNE,2,15,0), "Cristian", "Quizhpe", 25, "Quito", "Paula", 20);
	
	System.out.println(resp);
	
	}

}
