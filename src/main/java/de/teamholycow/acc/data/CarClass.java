package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;


@Getter
@RequiredArgsConstructor
public enum CarClass {
    FREE_FOR_ALL("FreeForAll"),
    GT3("GT3"),
    GT4("GT4"),
    GTC("GTC"),
    TCX("TCX"),
    GT2("GT2");

    private final String internalId;

    private final static Map<String, CarClass> CAR_CLASS_LOOKUP = new HashMap<>();

    static {
        for (CarClass carClass : CarClass.values()) {
            CAR_CLASS_LOOKUP.put(carClass.getInternalId(), carClass);
        }
    }

    public static CarClass get(String internalId) {
        return CAR_CLASS_LOOKUP.get(internalId);
    }
}
