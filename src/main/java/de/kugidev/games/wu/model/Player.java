package de.kugidev.games.wu.model;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
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
	@Column
    private String playerName;
    @OneToMany
    @JoinColumn(name="planet_id")
    private List<Planet> planets;
   // private Research research;
   // private Score score;

    public Player(String playerName) {
        this.playerName = playerName;
        this.planets = new ArrayList<>();
//        this.research = new Research(); // Initialisierung der Forschung
//        this.score = new Score(playerId);
    }
    

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

	public List<Planet> getPlanets() {
		return planets;
	}

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

	public long getId() {
		return id;
	}
	
	static protected Player getPlayerZero() {
		return new Player("PlayerZero");
	}
}
