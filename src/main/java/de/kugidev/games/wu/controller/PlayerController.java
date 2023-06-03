package de.kugidev.games.wu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.kugidev.games.wu.data.PlayerRepository;
import de.kugidev.games.wu.model.Player;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
    private PlayerRepository playerRepository;
 
    @GetMapping
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

}
