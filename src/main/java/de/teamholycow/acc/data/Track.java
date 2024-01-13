package de.teamholycow.acc.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Track {
    BARCELONA("barcelona", "Circuit de Barcelona - Catalunya", Dlc.BASE_GAME, 4.655),
    BRANDS_HATCH("brands_hatch", "Brands Hatch Circuit", Dlc.BASE_GAME, 3.916),
    HUNGARORING("hungaroring", "Hungaroring Circuit", Dlc.BASE_GAME, 4.381),
    MISANO("misano", "Misano", Dlc.BASE_GAME, 4.200),
    MONZA("monza", "Autodromo Nazionale Monza", Dlc.BASE_GAME, 5.793),
    NURBURGRING("nurburgring", "Nurburgring", Dlc.BASE_GAME, 5.137),
    PAUL_RICARD("paul_ricard", "Circuit - Paul Ricard", Dlc.BASE_GAME, 5.770),
    SILVERSTONE("silverstone", "Silverstone", Dlc.BASE_GAME, 5.890),
    SPA("spa", "Circuit de Spa-Francorchamps", Dlc.BASE_GAME, 7.004),
    ZOLDER("zolder", "Circuit Zolder", Dlc.BASE_GAME, 4.010),
    ZANDVOORT("zandvoort", "Circuit Park Zandvoort", Dlc.BASE_GAME, 4.320),
    DONINGTON("donington", "Donington Park", Dlc.BRITISH_PACK, 4.020),
    KYALAMI("kyalami", "Kyalami Grand Prix Circuit", Dlc.INTERNATIONAL_GT_PACK, 4.580),
    LAGUNA_SECA("laguna", "WeatherTech Raceway Laguna Seca", Dlc.INTERNATIONAL_GT_PACK, 3.602),
    MOUNT_PANORAMA("mount_panorama", "Bathurst Mount Panorama Circuit", Dlc.INTERNATIONAL_GT_PACK, 6.213),
    OULTON_PARK("oulton_park", "Oulton Park", Dlc.BRITISH_PACK, 4.333),
    SNETTERTON("snetterton", "Snetterton Circuit", Dlc.BRITISH_PACK, 4.779),
    SUZUKA("suzuka", "Suzuka Circuit", Dlc.INTERNATIONAL_GT_PACK, 5.807),
    IMOLA("imola", "Autodromo Enzo e Dino Ferrari - Imola", Dlc.GT_WORLD_CHALLENGE_PACK_2020, 4.909),
    COTA("cota", "Circuit of the Americas", Dlc.AMERICAN_TRACK_PACK, 5.516),
    INDIANAPOLIS("indianapolis", "Indianapolis Motor Speedway", Dlc.AMERICAN_TRACK_PACK, 4.192),
    WATKINS_GLEN("watkins_glen", "Watkins Glen", Dlc.AMERICAN_TRACK_PACK, 3.94),
    VALENCIA("valencia", "Circuit Ricardo Tormo", Dlc.GT_WORLD_CHALLENGE_2023, 4.005);


    private static final double KM_TO_MILES_FACTOR = 0.6213711922;

    private final String internalName;
    private final String name;
    private final Dlc dlc;
    private final double trackLength;

    private final static Map<String, Track> TRACK_LOOKUP = new HashMap<>();

    static {
        for (Track track : Track.values()) {
            TRACK_LOOKUP.put(track.getInternalName(), track);
        }
    }

    public static Track get(String internalName) {
        return TRACK_LOOKUP.get(internalName);
    }

    public double getTrackLengthInMiles() {
        return trackLength * KM_TO_MILES_FACTOR;
    }


}
