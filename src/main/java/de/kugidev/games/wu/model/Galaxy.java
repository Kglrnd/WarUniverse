package de.kugidev.games.wu.model;

import java.util.ArrayList;
import java.util.List;

import de.kugidev.games.wu.utils.NumberGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "galaxy")
public class Galaxy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @OneToMany
    @JoinColumn(name = "system_id")
	private ArrayList<PlanetSystem> systems;
	
	public Galaxy() {
		
		List<Integer> systemcount = NumberGenerator.generateNumbers(175, 210);
		systems = new ArrayList<PlanetSystem>();
		
		for(Integer sysid : systemcount) {
			systems.add(new PlanetSystem(sysid));
		}
	}
	
	public ArrayList<PlanetSystem> getSystems() {
		return systems;
	}
	public void setSystems(ArrayList<PlanetSystem> systems) {
		this.systems = systems;
	}

}
