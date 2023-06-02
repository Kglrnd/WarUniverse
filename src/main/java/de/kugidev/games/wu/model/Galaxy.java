package de.kugidev.games.wu.model;

import java.util.ArrayList;
import java.util.List;

import de.kugidev.games.wu.utils.NumberGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "galaxys")
public class Galaxy {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	private ArrayList<PlanetSystem> systems;
	
	private Integer galaxyId;
	
	public Galaxy(Integer galaxyId) {
		this.galaxyId = galaxyId;
		
		List<Integer> systemcount = NumberGenerator.generateNumbers(175, 210);
		systems = new ArrayList<PlanetSystem>();
		
		for(Integer sysid : systemcount) {
			systems.add(new PlanetSystem(galaxyId, sysid));
		}
	}
	
	public ArrayList<PlanetSystem> getSystems() {
		return systems;
	}
	public void setSystems(ArrayList<PlanetSystem> systems) {
		this.systems = systems;
	}
	public Integer getGalaxyId() {
		return galaxyId;
	}
	public void setGalaxyId(Integer galaxyId) {
		this.galaxyId = galaxyId;
	}

}
