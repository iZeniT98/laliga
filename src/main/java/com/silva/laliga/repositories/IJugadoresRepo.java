package com.silva.laliga.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.silva.laliga.entities.Jugador;

public interface IJugadoresRepo extends JpaRepository<Jugador, Integer> {

	
	@Query("select j from jugador j where id_equipo_jugador=:id")
	public List<Jugador> findByEquipo(Integer id);
	
	
}
