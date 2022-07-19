package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;


@Getter
@RequiredArgsConstructor
public enum MultiplayerVehicleClass {
    FREE_FOR_ALL("FreeForAll"),
    GT3("GT3"),
    GT4("GT4"),
    GTC("GTC"),
    TCX("TCX");

    private final String internalId;

    private final static Map<String, MultiplayerVehicleClass> MULTIPLAYER_VEHICLE_CLASS_LOOKUP = new HashMap<>();

    static {
        for (MultiplayerVehicleClass multiplayerVehicleClass : MultiplayerVehicleClass.values()) {
            MULTIPLAYER_VEHICLE_CLASS_LOOKUP.put(multiplayerVehicleClass.getInternalId(), multiplayerVehicleClass);
        }
    }

    public static MultiplayerVehicleClass get(String internalId) {
        return MULTIPLAYER_VEHICLE_CLASS_LOOKUP.get(internalId);
    }
}
