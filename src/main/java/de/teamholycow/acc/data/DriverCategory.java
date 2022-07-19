package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum DriverCategory {
    BRONZE(0, "Bronze"),
    SILVER(1, "Silver"),
    GOLD(2, "Gold"),
    PLATINUM(3, "Platinum");

    private final int internalId;
    private final String name;

    private final static Map<Integer, DriverCategory> DRIVER_CATEGORY_LOOKUP = new HashMap<>();

    static {
        for (DriverCategory driverCategory : DriverCategory.values()) {
            DRIVER_CATEGORY_LOOKUP.put(driverCategory.getInternalId(), driverCategory);
        }
    }

    public static DriverCategory get(int internalId) {
        return DRIVER_CATEGORY_LOOKUP.get(internalId);
    }
}
