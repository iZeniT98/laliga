package com.silva.laliga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silva.laliga.entities.Jugador;
import com.silva.laliga.repositories.IJugadoresRepo;

@Service
public class JugadorServiceImpl implements IJugadorService {

	
	@Autowired
	IJugadoresRepo jugadoresRepo;
	
	
	
	@Override
	public List<Jugador> findAll() {
		List<Jugador> jugadores = jugadoresRepo.findAll()
;		return jugadores;
	}

}
