package de.kugidev.games.wu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "scores")
public class Score {

//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String playerId;
	private int playerScore;
	private int destroyedPlanetsScore;
	private int attackPointsScore;
	private int defensePointsScore;

	public Score(String playerId) {
		this.playerId = playerId;
		playerScore = 0;
		destroyedPlanetsScore = 0;
		attackPointsScore = 0;
		defensePointsScore = 0;
	}

	public String getPlayerId() {
		return playerId;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void increasePlayerScore(int playerScore) {
		if (playerScore > 0) {
			this.playerScore += playerScore;
		}
	}

	public int getDestroyedPlanetsScore() {
		return destroyedPlanetsScore;
	}

	public void increaseDestroyedPlanetsScore(int destroyedPlanetsScore) {
		if (destroyedPlanetsScore > 0) {
			this.destroyedPlanetsScore += destroyedPlanetsScore;
		}
	}

	public int getAttackPointsScore() {
		return attackPointsScore;
	}

	public void increaseAttackPointsScore(int attackPointsScore) {
		if (attackPointsScore > 0) {
			this.attackPointsScore += attackPointsScore;
		}
	}

	public int getDefensePointsScore() {
		return defensePointsScore;
	}

	public void increaseDefensePointsScore(int defensePointsScore) {
		if (defensePointsScore > 0) {
			this.defensePointsScore += defensePointsScore;
		}
	}
}
