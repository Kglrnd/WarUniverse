package de.kugidev.games.wu.model;

import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "research")
public class Research {
	
	//@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private int researchSpeed;
    private Map<String, Integer> researchLevels;
    // Weitere Attribute je nach Anforderungen des Spiels

    public Research() {
        this.researchSpeed = 1; // Standard-Forschungsgeschwindigkeit
        this.researchLevels = new HashMap<>();
        // Initialisierung der Forschungsstufen für verschiedene Kategorien
        // Beispiel: researchLevels.put("Weapons", 1);
        // Beispiel: researchLevels.put("Shields", 0);
    }

    // Getter und Setter für die Attribute

    public int getResearchSpeed() {
        return researchSpeed;
    }

    public void setResearchSpeed(int researchSpeed) {
        this.researchSpeed = researchSpeed;
    }

    public Map<String, Integer> getResearchLevels() {
        return researchLevels;
    }

    public void setResearchLevels(Map<String, Integer> researchLevels) {
        this.researchLevels = researchLevels;
    }

    // Weitere Methoden für die Forschungsklasse
    public void increaseResearchLevel(String category) {
        int currentLevel = researchLevels.getOrDefault(category, 0);
        researchLevels.put(category, currentLevel + 1);
    }
    
    public int getResearchLevel(String category) {
        return researchLevels.getOrDefault(category, 0);
    }
}
