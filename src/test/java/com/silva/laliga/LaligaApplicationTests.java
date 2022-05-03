package com.silva.laliga;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.silva.laliga.entities.Jugador;
import com.silva.laliga.repositories.IJugadoresRepo;


@SpringBootTest
class LaligaApplicationTests {

	@Autowired
	IJugadoresRepo jugadoresRepo;
	
	@Test
	void findAllJugadores() {
		List<Jugador> jugadores = jugadoresRepo.findAll();
		for (Jugador jugador : jugadores) {
			System.out.println(jugador.getNombre());
		}
		}

}
