package de.kugidev.games.wu.model.enums;

public enum ResourceEnum {
    IRON("Iron"),
    GOLD("Gold"),
    URANIUM("Uranium"),
    OIL("Oil"),
    HYDROGEN("Hydrogen"),
    ENERGY("Energy");

    private final String displayName;

    ResourceEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
