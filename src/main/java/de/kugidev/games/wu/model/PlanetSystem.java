package de.kugidev.games.wu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "systems")
public class PlanetSystem {
	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer planetSystemId;
	private Integer galaxyId;

	public PlanetSystem(Integer galaxyId, Integer sysid) {
		
	}

}
