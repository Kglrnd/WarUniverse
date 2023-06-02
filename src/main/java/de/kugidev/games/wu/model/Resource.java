package de.kugidev.games.wu.model;

public enum Resource {
    IRON("Iron"),
    GOLD("Gold"),
    URANIUM("Uranium"),
    OIL("Oil"),
    HYDROGEN("Hydrogen"),
    ENERGY("Energy");

    private final String displayName;

    Resource(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
