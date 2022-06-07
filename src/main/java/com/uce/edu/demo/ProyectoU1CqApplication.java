package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.matriculacion.vehicular.MatriculacionVehicular;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;
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

//	@Autowired
//	private Matricula matricula;
	
	@Autowired
	private MatriculacionVehicular matriculacionVehi;

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
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
		
		//System.out.println(this.matriculacionVehi.matricularVehiculo("VMW", "LGF-2155", "Manuel", "Medina", "1754879852"));

	
		//Taller 8
		
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Cristian");
		e1.setApellido("Quizhpe");
		e1.setCedula("1102512458");
	
//		this.estudianteService.insertarEstudiante(e1);
//		this.estudianteService.buscarEstudiante(e1.getCedula());
//		this.estudianteService.actualizarEstudiante(e1);
//		this.estudianteService.eliminarEstudiante(e1.getCedula());
//	
	
		Estudiante e2 = new Estudiante();
		e2.setNombre("Pepito");
		e2.setApellido("Perez");
		e2.setCedula("1702001458");
		
//		this.estudianteService.insertarEstudiante(e2);
//		this.estudianteService.buscarEstudiante(e2.getCedula());
//		this.estudianteService.actualizarEstudiante(e2);
//		this.estudianteService.eliminarEstudiante(e2.getCedula());
		
	
	
		//Tarea 6
		
		
		Materia materia1 = new Materia();
		materia1.setNombre("Analisis Matematico");
		materia1.setSemestre("Quinto");
		
		System.out.println("------------------------------------ MATERIA  ------------------------");
		this.materiaService.insertarMateria(materia1);
		this.materiaService.buscarMateriaPorNombre("Analisis Matematico");
		this.materiaService.actualizarMateria(materia1);
		this.materiaService.eliminarMateria("Analisis Matematico");
		
		Materia materia2 = new Materia();
		materia2.setNombre("Matematica Discreta");
		materia2.setSemestre("Quinto");
		
		
		this.materiaService.insertarMateria(materia2);
		this.materiaService.buscarMateriaPorNombre("Matematica Discreta");
		this.materiaService.actualizarMateria(materia2);
		this.materiaService.eliminarMateria("Matematica Discreta");
		
		
		System.out.println("------------------------------------ MATRICULA  ------------------------");
		List<Materia> listaMaterias=new ArrayList<>();
		listaMaterias.add(materia1);
		listaMaterias.add(materia2);
		
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(e1);
		matricula1.setNumero("A123-3234");
		matricula1.setMaterias(listaMaterias);
		
		
		this.matriculaService.insertarMatricula(matricula1);
		this.matriculaService.buscarMatricula(matricula1.getNumero());
		this.matriculaService.actualizarMatricula(matricula1);
		this.matriculaService.eliminarMatricula(matricula1.getNumero());
		
		
	}

}
