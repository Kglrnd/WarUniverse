package de.kugidev.games.wu.model;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
    private String playerId;
    private String playerName;
    //private List<Planet> planets;
   // private Research research;
   // private Score score;
    
    public Player() {};

    public Player(String playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
        //this.planets = new ArrayList<>();
//        this.research = new Research(); // Initialisierung der Forschung
//        this.score = new Score(playerId);
    }
    
    public Player(String playerId, String playerName, List<Planet> planets, Research research, Score score) {
        this.playerId = playerId;
        this.playerName = playerName;
       // this.planets = planets;
//        this.research = new Research(); // Initialisierung der Forschung
//        this.score = score;
    }

    // Getter und Setter für die Attribute

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

//	public List<Planet> getPlanets() {
//		return planets;
//	}

//    public void setPlanets(List<Planet> planets) {
//        this.planets = planets;
//    }

//    public Research getResearch() {
//        return research;
//    }
//
//    public void setResearch(Research research) {
//        this.research = research;
//    }
//
//	public Score getScore() {
//		return this.score;
//	}

//	public void increaseDestroyedPlanetsScore(int i) {
//		this.score.increaseDestroyedPlanetsScore(i);
//		
//	}
//	
//	public void increasePlayerScore(int i) {
//		this.score.increasePlayerScore(i);
//	}
//	
//	public void increaseAttackPointsScore(int i) {
//		this.score.increaseAttackPointsScore(i);
//	}
//	
//	public void increaseDefensePointsScore(int i) {
//		this.score.increaseDefensePointsScore(i);
//	}

//	/**
//	 * Setzt alle Scores zurück
//	 */
//	public void resetScore() {
//		this.score = new Score(this.playerId);
//		
//	}

    // Weitere Methoden für die Spielerklasse (z.B., um Planeten hinzuzufügen/entfernen, Forschungsgeschwindigkeit zu ändern, etc.)
}
