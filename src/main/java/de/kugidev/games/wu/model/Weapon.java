package de.kugidev.games.wu.model;

import de.kugidev.games.wu.model.enums.WeaponEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "weapon")
public class Weapon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private WeaponEnum weaponType;
	
	@Column
    private int damage;
	@Column
    private int accuracy;
	
	@ManyToOne
	@JoinColumn(name = "ship_id")
	private Ship ship;
	
	public Weapon(WeaponEnum weaponType) {
		this.weaponType = weaponType;
		//define standard values
		this.damage = weaponType.getDamage();
		this.accuracy = weaponType.getAccuracy();
	}
	
	//TODO: Research Level need to recognized

}
