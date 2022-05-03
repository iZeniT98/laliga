package com.silva.laliga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.laliga.entities.Jugador;

public interface IJugadoresRepo extends JpaRepository<Jugador, Integer> {

}
