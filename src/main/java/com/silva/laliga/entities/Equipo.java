package com.silva.laliga.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="equipo")
public class Equipo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_equipo;
	private String nombre_equipo;
	private String foto_equipo;
	
	public Equipo() {
		super();
	}

	public Equipo(int id_equipo, String nombre_equipo, String foto_equipo) {
		super();
		this.id_equipo = id_equipo;
		this.nombre_equipo = nombre_equipo;
		this.foto_equipo = foto_equipo;
	}

	public int getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}

	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public String getFoto_equipo() {
		return foto_equipo;
	}

	public void setFoto_equipo(String foto_equipo) {
		this.foto_equipo = foto_equipo;
	}
	
	
	
	
	
}
