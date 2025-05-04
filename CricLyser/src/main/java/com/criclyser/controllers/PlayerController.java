package com.criclyser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.criclyser.entities.Player;
import com.criclyser.repositories.PlayerRepository;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
