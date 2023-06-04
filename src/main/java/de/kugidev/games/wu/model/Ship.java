package de.kugidev.games.wu.model;

import java.util.ArrayList;
import java.util.List;

import de.kugidev.games.wu.model.enums.ShipTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ships")
public class Ship {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
    private ShipTypeEnum type;
	@Column
    private long amount;
	@OneToMany
    private List<Weapon> weapons;
	@OneToMany
    private List<Shield> shields;
    
    public Ship(ShipTypeEnum type) {
    	this.setType(type);
    	weapons = new ArrayList<>();
    	shields = new ArrayList<>();
    }

	/**
	 * @return the type
	 */
	public ShipTypeEnum getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ShipTypeEnum type) {
		this.type = type;
	}

	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}


}