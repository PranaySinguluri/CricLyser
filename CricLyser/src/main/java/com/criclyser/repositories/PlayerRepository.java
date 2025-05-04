package com.criclyser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.criclyser.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
	
	
	
}
