package com.silva.laliga.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silva.laliga.entities.Jugador;
import com.silva.laliga.services.IJugadorService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestJugadoresController {
	@Autowired
	IJugadorService jugadoresService;
	
	@GetMapping(path = "/jugadores", produces = { MediaType.APPLICATION_JSON_VALUE} )
	List<Jugador> getJugadores() {
		return jugadoresService.findAll();
	}
}
