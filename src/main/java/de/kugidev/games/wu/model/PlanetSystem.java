package de.kugidev.games.wu.model;

import java.util.ArrayList;
import java.util.List;

import de.kugidev.games.wu.utils.NumberGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "system")
public class PlanetSystem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Integer planetSystemId;
	
	@ManyToOne
	@JoinColumn(name = "galaxy_id")
	private Galaxy galaxy;
	
	@OneToMany
	@JoinColumn(name = "planet_id")
	private List<Planet> planets;

	public PlanetSystem(Integer sysid) {
		this.planetSystemId = sysid;
		
		List<Integer> systemcount = NumberGenerator.generateNumbers(6, 13);
		planets = new ArrayList<Planet>();
		
		for(Integer planetId : systemcount) {
			planets.add(new Planet("nicht kolonisiert", 0, planetId, Player.getPlayerZero()));
		}
	}

}
