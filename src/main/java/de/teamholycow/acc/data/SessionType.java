package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum SessionType {
    PRACTICE(0, "T", "Practice"),
    QUALIFYING(4, "Q", "Qualifying"),
    RACE(10, "R", "Race");


    private final int internalId;
    private final String identifier;
    private final String name;

    private final static Map<String, SessionType> SESSION_TYPE_LOOKUP = new HashMap<>();

    static {
        for (SessionType sessionType : SessionType.values()) {
            SESSION_TYPE_LOOKUP.put(sessionType.getIdentifier(), sessionType);
        }
    }

    public static SessionType get(String identifier) {
        return SESSION_TYPE_LOOKUP.get(identifier);
    }
}
