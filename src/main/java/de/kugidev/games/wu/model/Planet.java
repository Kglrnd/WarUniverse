package de.kugidev.games.wu.model;

import java.util.*;

import de.kugidev.games.wu.model.enums.ResourceEnum;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "planet")
public class Planet {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Integer planetNumber;
	@Column
    private String name;
	@Column
    private int energyGeneration;
	
	@ElementCollection
	@CollectionTable(name = "planet_resources")
	@MapKeyEnumerated(EnumType.STRING)
	@Column(name = "resource_amount")
	private Map<ResourceEnum, Long> resources;
	
	@ManyToOne
	@JoinColumn(name = "player_id")
	private Player player;
	
	@OneToMany
	@JoinColumn(name = "building_id")
	private List<Building> buildings;

	public Planet(String name, int energyGeneration, Integer planetId, Player player) {
	    this.name = name;
	    this.energyGeneration = energyGeneration;
	    this.resources = new HashMap<ResourceEnum, Long>();
	    setPlayer(player);
	    
	 // Initialisierung des Planeten
        this.buildings = new ArrayList<>();
	}


    // Getter und Setter

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
    
    public void addResource(ResourceEnum resource, long amount) {
        this.resources.put(resource, amount);
    }
    
    public long getResourceAmount(ResourceEnum resource) {
		return energyGeneration;
    }
    
    public Map<ResourceEnum, Long> getResources() {
		return resources;
    }
	
	public void setPlayer(Player player) {
	    this.player = player;
	}

	public Player getPlayer() {
	    return player;
	}
	
    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

}

