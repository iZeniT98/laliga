package com.silva.laliga.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silva.laliga.entities.Equipo;
import com.silva.laliga.services.IEquipoService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestEquiposController {
	
	@Autowired
	IEquipoService equiposService;


	
	@GetMapping(path = "/equipos", produces = { MediaType.APPLICATION_JSON_VALUE} )
	List<Equipo> getEquipos() {
		return equiposService.findAll();
	}

}
