package de.kugidev.games.wu.model.enums;

public enum ShipTypeEnum {

	
	LIGHT_CRUISER("Leichter Kreuzer"),
	HEAVY_CRUISER("Schwerer Kreuzer"),
	BATTLESHIP("Schlachtschiff"),
	PLANET_DESTROYER("Planeten Zerstörer"),
	PLANET_INVADER("Planeten Invasierer"),
	PLANET_COLONIZER("Planeten Kolonisierer"),
	TRANSPORTER("Transporter");
	
	private final String displayName;
	
	ShipTypeEnum(String displayName){
		this.displayName = displayName;
	}
	
    public String getDisplayName() {
        return displayName;
    }
	
	

}
