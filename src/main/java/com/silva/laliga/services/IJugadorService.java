package com.silva.laliga.services;

import java.util.List;


import com.silva.laliga.entities.Jugador;

public interface IJugadorService {
	public void addJugador(Jugador c); 
	public List<Jugador> findAll();
	public List<Jugador> findByEquipo(Integer id);
}
