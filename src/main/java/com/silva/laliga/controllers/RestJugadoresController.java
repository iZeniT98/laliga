package com.silva.laliga.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.silva.laliga.entities.Jugador;
import com.silva.laliga.services.IJugadorService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestJugadoresController {
	@Autowired
	IJugadorService jugadoresService;

	@GetMapping(path = "/jugadores", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Jugador> getJugadores() {
		return jugadoresService.findAll();
	}

	
	@GetMapping(path="/jugadoresPorEquipo", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Jugador> getJugadoresPE(@RequestParam(required = true) int id_equipo_jugador){
		return jugadoresService.findByEquipo(id_equipo_jugador);
	}
	
	@RequestMapping(value = "/crearJugador")
	public ModelAndView crearNuevoJugador(@RequestParam(required = false) String nombre,
			@RequestParam(required = false) int id_equipo_jugador, @RequestParam(required = false) String nacimiento,
			@RequestParam(required = false) String posicion, @RequestParam(required = false) int goles,
			@RequestParam(required = false) int asistencias, @RequestParam(required = false) int tarjetas_amarillas,
			@RequestParam(required = false) int tarjetas_rojas, @RequestParam(required = false) String foto,
			@RequestParam(required = false) int dorsal) {

		if (nombre != null) {
			Jugador c = new Jugador(0, nombre, id_equipo_jugador, nacimiento, posicion, goles, asistencias,
					tarjetas_amarillas, tarjetas_rojas, foto, dorsal);
			jugadoresService.addJugador(c);
		}
		
		List<Jugador> jugadores= jugadoresService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crearJugador");
		mav.addObject("ajugadores", jugadores);
		return mav;

	}
}
