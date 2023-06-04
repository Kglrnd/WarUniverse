package de.kugidev.games.wu.model.enums;

public enum WeaponEnum {

	ION_LASER("Ionen Laser", 50, 10),
    PLASMA_CANNON("Plasma Kanone", 100, 20),
    ELECTRICENERGY_CANNON("Elektronenenergie Kanone", 20, 80);

    private String name;
    private int damage;
    private int accuracy;

    WeaponEnum(String name, int damage, int accuracy) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }
}