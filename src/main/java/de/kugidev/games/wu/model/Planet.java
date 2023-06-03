package de.kugidev.games.wu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "planet")
public class Planet {
	//PlayerId 0 means no one owns the planet
	private String playerId;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Integer planetNumber;
	@Column
    private String name;
	@Column
    private int energyGeneration;

    public Planet(String name, int energyGeneration, Integer planetId) {
        this.name = name;
        this.energyGeneration = energyGeneration;
    }

    // Getter und Setter für die Attribute

    public String getName() {
        return name;
    }
    
    public Integer getPlanetId() {
    	return this.planetNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyGeneration() {
        return energyGeneration;
    }

    public void setEnergyGeneration(int energyGeneration) {
        this.energyGeneration = energyGeneration;
    }

	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}
}

