package com.silva.laliga.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.silva.laliga.entities.Equipo;
import com.silva.laliga.repositories.IEquiposRepo;

@Service
public class EquipoServiceImpl implements IEquipoService {

	
	@Autowired
	IEquiposRepo equiposRepo;
	
	@Override
	public List<Equipo> findAll() {
		List<Equipo> equipos = equiposRepo.findAll()
;		return equipos;
	}

}
