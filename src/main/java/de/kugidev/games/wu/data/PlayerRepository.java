package de.kugidev.games.wu.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.kugidev.games.wu.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
