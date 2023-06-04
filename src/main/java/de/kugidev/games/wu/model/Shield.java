package de.kugidev.games.wu.model;

import de.kugidev.games.wu.model.enums.ShieldEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shield")
public class Shield {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private ShieldEnum shieldtype;
	
	@Column
    private int strength;
	
	@Column
    private int efficiency;
	
	@ManyToOne
	@JoinColumn(name = "ship_id")
	private Ship ship;
	
	public Shield(ShieldEnum shieldtype) {
		this.shieldtype = shieldtype;
		this.strength = shieldtype.getStrength();
		this.efficiency = shieldtype.getEfficiency();
		
	}

}
