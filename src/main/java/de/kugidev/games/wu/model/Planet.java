package de.kugidev.games.wu.model;

import java.util.Map;
import java.util.HashMap;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "planets")
public class Planet {
	//PlayerId 0 means no one owns the planet
	private String playerId;
	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer planetId;
    private String name;
    private int energyGeneration;
    private Map<String, Integer> resourceProduction;
    private Map<String, Integer> buildingLevels;
    // Weitere Attribute je nach Anforderungen des Spiels

    public Planet(String name, int energyGeneration, Integer planetId) {
        this.name = name;
        this.energyGeneration = energyGeneration;
        this.resourceProduction = new HashMap<>();
        // Initialisierung der Ressourcenproduktion für verschiedene Ressourcen
        // Beispiel: resourceProduction.put("Iron", 10);
        // Beispiel: resourceProduction.put("Gold", 5);
        
        this.buildingLevels = new HashMap<>();
        // Initialisierung der Gebäudestufen für verschiedene Gebäudetypen
        // Beispiel: buildingLevels.put("Mines", 1);
        // Beispiel: buildingLevels.put("ResearchCenter", 0);
    }

    // Getter und Setter für die Attribute

    public String getName() {
        return name;
    }
    
    public Integer getPlanetId() {
    	return this.planetId;
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

    public Map<String, Integer> getResourceProduction() {
        return resourceProduction;
    }

    public void setResourceProduction(Map<String, Integer> resourceProduction) {
        this.resourceProduction = resourceProduction;
    }

    public Map<String, Integer> getBuildingLevels() {
        return buildingLevels;
    }

    public void setBuildingLevels(Map<String, Integer> buildingLevels) {
        this.buildingLevels = buildingLevels;
    }

    // Weitere Methoden für die Planetenklasse
    public void increaseBuildingLevel(String buildingType) {
        int currentLevel = buildingLevels.getOrDefault(buildingType, 0);
        buildingLevels.put(buildingType, currentLevel + 1);
    }
    
    public int getBuildingLevel(String buildingType) {
        return buildingLevels.getOrDefault(buildingType, 0);
    }
    
    public int getResourceProduction(String resourceType) {
        return resourceProduction.getOrDefault(resourceType, 0);
    }

	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}
}

