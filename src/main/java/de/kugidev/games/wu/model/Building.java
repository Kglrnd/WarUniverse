package de.kugidev.games.wu.model;

import de.kugidev.games.wu.model.enums.BuildingEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "building")
public class Building {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@ManyToOne
	@JoinColumn(name = "planet_id")
	private Planet planet;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BuildingEnum type;

    @Column(nullable = false)
    private int level;

    public Building(BuildingEnum type, int level) {
        this.type = type;
        this.level = level;
    }

}
