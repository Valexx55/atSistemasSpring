package edu.val.cle.atsistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.val.cle.atsistemas.model.entity.Alumno;
import edu.val.cle.atsistemas.services.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	/**
	 *  LEER LOS ALUMNOS -get
		LEER UN ALUMNO - get
        BORRAR UN ALUMNO - delete
		CREAR UN ALUMNO - post
	    ACTUALIZAR UN ALUMNO - put
	 */
	
	@GetMapping("/alumno-test") //GET http://localhost:8081/alumno/alumno-test
	public Alumno obtenerAlumnoTest ()
	{
		Alumno alumno = null;
		
			alumno = new Alumno(5l, "PACO", "paco@correo.es", 19);
		
		return alumno;
	}

}
