package de.kugidev.games.wu.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "ships")
public class Ship {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private int attack;
    private int defense;
    // weitere Felder hier

    // Getter und Setter hier

}