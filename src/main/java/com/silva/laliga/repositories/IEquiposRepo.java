package com.silva.laliga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.laliga.entities.Equipo;


public interface IEquiposRepo extends JpaRepository<Equipo, Integer> {

}
