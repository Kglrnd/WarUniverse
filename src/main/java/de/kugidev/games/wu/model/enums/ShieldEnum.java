package de.kugidev.games.wu.model.enums;

public enum ShieldEnum {
    ENERGY_SHIELD("Energie Schild", 100, 50),
    PLASMA_SHIELD("PLASMA", 200, 30);

    private String name;
    private int strength;
    private int efficiency;

    ShieldEnum(String name, int strength, int efficiency) {
        this.name = name;
        this.strength = strength;
        this.efficiency = efficiency;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getEfficiency() {
        return efficiency;
    }
}

