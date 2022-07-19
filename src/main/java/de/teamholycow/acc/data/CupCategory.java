package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum CupCategory {
    OVERALL(0, "Overall"),
    PRO_AM(1, "ProAm"),
    AM(2, "Am"),
    SILVER(3, "Silver"),
    NATIONAL(3, "national");

    private final int internalId;
    private final String name;

    private final static Map<Integer, CupCategory> CUP_CATEGORY_LOOKUP = new HashMap<>();

    static {
        for (CupCategory cupCategory : CupCategory.values()) {
            CUP_CATEGORY_LOOKUP.put(cupCategory.getInternalId(), cupCategory);
        }
    }

    public static CupCategory get(int internalId) {
        return CUP_CATEGORY_LOOKUP.get(internalId);
    }
}
