package de.kugidev.games.wu.model;

import org.junit.jupiter.api.BeforeAll;

public class PlayerTest {

    private static Player player;

    @BeforeAll
    public static void setup() {
        player = new Player("PlayerOne");
    }

//    @Test
//    public void testInitialScores() {
//        assertAll("Initial scores",
//            () -> assertEquals(0, player.getScore().getPlayerScore()),
//            () -> assertEquals(0, player.getScore().getAttackPointsScore()),
//            () -> assertEquals(0, player.getScore().getDefensePointsScore()),
//            () -> assertEquals(0, player.getScore().getDestroyedPlanetsScore())
//        );
//    }
//
//    @Test
//    public void testIncreasePlayerScore() {
//        player.increasePlayerScore(100);
//        assertEquals(100, player.getScore().getPlayerScore());
//
//        player.increasePlayerScore(50);
//        assertEquals(150, player.getScore().getPlayerScore());
//    }
//
//    @Test
//    public void testIncreaseAttackPointsScore() {
//        player.increaseAttackPointsScore(50);
//        assertEquals(50, player.getScore().getAttackPointsScore());
//    }
//
//    @Test
//    public void testIncreaseDefensePointsScore() {
//        player.increaseDefensePointsScore(25);
//        assertEquals(25, player.getScore().getDefensePointsScore());
//    }
//
//    @Test
//    public void testIncreaseDestroyedPlanetsScore() {
//        player.increaseDestroyedPlanetsScore(5);
//        assertEquals(5, player.getScore().getDestroyedPlanetsScore());
//    }
//
//    @Test
//    public void testIncreaseScoreWithNegativeValue() {
//    	player.resetScore();
//        player.increasePlayerScore(-50);
//        assertEquals(0, player.getScore().getPlayerScore());
//    }
//
//    @Test
//    public void testResetScore() {
//        player.increasePlayerScore(200);
//        player.resetScore();
//        assertEquals(0, player.getScore().getPlayerScore());
//        assertEquals(0, player.getScore().getAttackPointsScore());
//        assertEquals(0, player.getScore().getDefensePointsScore());
//        assertEquals(0, player.getScore().getDestroyedPlanetsScore());
//        }
//    
//    @Test
//    public void testIncreaseScoreOfAnotherPlayer() {
//        Player anotherPlayer = new Player("2", "PlayerTwo");
//        anotherPlayer.increasePlayerScore(100);
//        assertEquals(100, anotherPlayer.getScore().getPlayerScore());
//
//        assertEquals(0, player.getScore().getPlayerScore());
//    }
    
}