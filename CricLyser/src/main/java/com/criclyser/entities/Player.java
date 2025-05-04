package com.criclyser.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Player_name", nullable = false)
    private String Player_name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "team")
    private String team;

    // Constructors, Getters and Setters
}
