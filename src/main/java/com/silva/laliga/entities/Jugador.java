package com.silva.laliga.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="jugador")
public class Jugador {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_jugador;
		private String nombre;
		private int id_equipo_jugador;
		private String nacimiento;
		private String posicion;
		private int goles;
		private int asistencias;
		private int tarjetas_amarillas;
		private int tarjetas_rojas;
		private String foto;
		private int dorsal;
		
		public Jugador() {
			super();
		}

		public Jugador(int id_jugador, String nombre, int id_equipo_jugador, String nacimiento, String posicion,
				int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas, String foto, int dorsal) {
			super();
			this.id_jugador = id_jugador;
			this.nombre = nombre;
			this.id_equipo_jugador = id_equipo_jugador;
			this.nacimiento = nacimiento;
			this.posicion = posicion;
			this.goles = goles;
			this.asistencias = asistencias;
			this.tarjetas_amarillas = tarjetas_amarillas;
			this.tarjetas_rojas = tarjetas_rojas;
			this.foto = foto;
			this.dorsal = dorsal;
		}

		public int getId_jugador() {
			return id_jugador;
		}

		public void setId_jugador(int id_jugador) {
			this.id_jugador = id_jugador;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getId_equipo_jugador() {
			return id_equipo_jugador;
		}

		public void setId_equipo_jugador(int id_equipo_jugador) {
			this.id_equipo_jugador = id_equipo_jugador;
		}

		public String getNacimiento() {
			return nacimiento;
		}

		public void setNacimiento(String nacimiento) {
			this.nacimiento = nacimiento;
		}

		public String getPosicion() {
			return posicion;
		}

		public void setPosicion(String posicion) {
			this.posicion = posicion;
		}

		public int getGoles() {
			return goles;
		}

		public void setGoles(int goles) {
			this.goles = goles;
		}

		public int getAsistencias() {
			return asistencias;
		}

		public void setAsistencias(int asistencias) {
			this.asistencias = asistencias;
		}

		public int getTarjetas_amarillas() {
			return tarjetas_amarillas;
		}

		public void setTarjetas_amarillas(int tarjetas_amarillas) {
			this.tarjetas_amarillas = tarjetas_amarillas;
		}

		public int getTarjetas_rojas() {
			return tarjetas_rojas;
		}

		public void setTarjetas_rojas(int tarjetas_rojas) {
			this.tarjetas_rojas = tarjetas_rojas;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public int getDorsal() {
			return dorsal;
		}

		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}


		
		
	
	
	
	
}
