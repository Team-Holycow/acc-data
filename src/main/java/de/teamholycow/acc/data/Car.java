package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
@Getter
public enum Car {
    PORSCHE_911_GT3_R(Brands.PORSCHE, 0, "Porsche 991 GT3 R", 2018, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    MERCEDES_AMG_GT3_2015(Brands.Mercedes, 1, "Mercedes-AMG GT3", 2015, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    FERRARI_488_GT3(Brands.FERRARI, 2, "Ferrari 488 GT3", 2018, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    AUDI_R8_LMS(Brands.AUDI, 3, "Audi R8 LMS", 2015, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    LAMBORGHINI_HURACAN_GT3(Brands.LAMBORGHINI, 4, "Lamborghini Huracan GT3", 2015, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    MCLAREN_650S_GT3(Brands.MCLAREN, 5, "McLaren 650S GT3", 2015, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    NISSAN_GTR_NISMO_GT3_2018(Brands.NISSAN, 6, "Nissan GT-R Nismo GT3", 2018, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    BMW_M6_GT3(Brands.BMW, 7, "BMW M6 GT3", 2017, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    BENTLEY_CONTINENTAL_GT3_2018(Brands.BENTLEY, 8, "Bentley Continental GT3", 2018, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    PORSCHE_911_II_GT3_CUP(Brands.PORSCHE, 9, "Porsche 991 II GT3 Cup", 2017, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GTC)),
    NISSAN_GTR_NISMO_GT3_2015(Brands.NISSAN, 10, "Nissan GT-R Nismo GT3", 2015, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    BENTLEY_CONTINENTAL_GT3_2015(Brands.BENTLEY, 11, "Bentley Continental GT3", 2015, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    AMR_V12_VANTAGE_GT3(Brands.ASTON_MARTIN, 12, "AMR V12 Vantage GT3", 2013, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    REITER_ENGINEERING_REX_GT3(Brands.LAMBORGHINI, 13, "Reiter Engineering R-EX GT3", 2017, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    EMIL_FREY_JAGUAR_G3(Brands.JAGUAR, 14, "Emil Frey Jaguar G3", 2012, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    LEXUS_RC_F_GT3(Brands.LEXUS, 15, "Lexus RC F GT3", 2016, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    LAMBORGHINI_HURACAN_GT3_EVO(Brands.LAMBORGHINI, 16, "Lamborghini Huracan GT3 Evo", 2019, Dlc.FREE_CONTENT_UPDATE_2019, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    HONDA_NSX_GT3(Brands.HONDA, 17, "Honda NSX GT3", 2017, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    LAMBORGHINI_HURACAN_SUPERTROFEO(Brands.LAMBORGHINI, 18, "Lamborghini Huracan SuperTrofeo", 2015, Dlc.BASE_GAME, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GTC)),
    AUDI_R8_LMS_EVO(Brands.AUDI, 19, "Audi R8 LMS Evo", 2019, Dlc.FREE_CONTENT_UPDATE_2019, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    AMR_V8_VANTAGE(Brands.ASTON_MARTIN, 20, "AMR V8 Vantage GT3", 2019, Dlc.FREE_CONTENT_UPDATE_2019, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    HONDA_NSX_GT3_EVO(Brands.HONDA, 21, "Honda NSX GT3 Evo", 2019, Dlc.FREE_CONTENT_UPDATE_2019, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    MCLAREN_720S_GT3(Brands.MCLAREN, 22, "McLaren 720S GT3", 2019, Dlc.MCLAREN_SHADOW_EVENT, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    PORSCHE_911_II_GT3_R(Brands.PORSCHE, 23, "Porsche 911 II GT3 R", 2019, Dlc.FREE_CONTENT_UPDATE_2019, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    FERRARI_488_GT3_EVO(Brands.FERRARI, 24, "Ferrari 488 GT3 Evo", 2020, Dlc.GT_WORLD_CHALLENGE_PACK_2020, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    MERCEDES_AMG_GT3_2020(Brands.Mercedes, 25, "Mercedes-AMG GT3", 2020, Dlc.GT_WORLD_CHALLENGE_PACK_2020, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    FERRARI_488_CHALLENGE_EVO(Brands.FERRARI, 26, "Ferrari 488 Challenge Evo", 2020, Dlc.CHALLENGERS_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GTC)),
    BMW_M2_CLUB_SPORT_RACING(Brands.BMW, 27, "BMW M2 Club Sport Racing", 2021, Dlc.CHALLENGERS_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.TCX)),
    PORSCHE_992_GT3_CUP(Brands.PORSCHE, 28, "Porsche 992 GT3 Cup", 2021, Dlc.CHALLENGERS_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GTC)),
    LAMBORGHINI_HURACAN_SUPERTROFEO_EVO2(Brands.LAMBORGHINI, 29, "Lamborghini Huracan SuperTrofeo Evo2", 2021, Dlc.CHALLENGERS_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GTC)),
    BMW_M4_GT3(Brands.BMW, 30, "BMW M4 GT3", 2022, Dlc.FREE_CONTENT_UPDATE_2021, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    AUDI_R8_LMG_GT3_EVO_2(Brands.AUDI, 31, "Audi R8 LMS GT3 EVO 2", 2021, Dlc.CHALLENGERS_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT3)),
    ALPINE_A110_GT4(Brands.ALPINE, 50, "Alpine A110 GT4", 2018, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    ASTON_MARTIN_GT4(Brands.ASTON_MARTIN, 51, "Aston Martin GT4", 2018, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    AUDI_R8_LMS_GT4(Brands.AUDI, 52, "Audi R8 LMS GT4", 2018, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    BMW_M4_GT4(Brands.BMW, 53, "BMW M4 GT4", 2019, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    CHEVROLET_CAMARO_GT4(Brands.CHEVROLET, 55, "Chevrolet Camaro GT4", 2017, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    GINETTA_G55_GT4(Brands.GINETTA, 56, "Ginetta G55 GT4", 2012, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    KTM_XBOW_GT4(Brands.KTM, 57, "KTM X-Bow GT4", 2016, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    MASERATI_MC_GT4(Brands.MASERATI, 58, "Maserati MC GT4", 2016, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    MCLAREN_570S_GT4(Brands.MCLAREN, 59, "McLaren 570S GT4", 2016, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    MERCEDES_AMG_GT4(Brands.Mercedes, 60, "Mercedes AMG GT4", 2016, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4)),
    PORSCHE_CAYMAN_GT4(Brands.PORSCHE, 61, "Porsche Cayman GT4", 2019, Dlc.GT4_PACK, Set.of(MultiplayerVehicleClass.FREE_FOR_ALL, MultiplayerVehicleClass.GT4));

    private final Brands brand;
    private final int internalId;
    private final String name;
    private final int year;
    private final Dlc dlc;
    private final Set<MultiplayerVehicleClass> classes;

    private final static Map<Integer, Car> CAR_LOOKUP = new HashMap<>();

    static {
        for (Car car : Car.values()) {
            CAR_LOOKUP.put(car.getInternalId(), car);
        }
    }

    public static Car get(int internalId) {
        return CAR_LOOKUP.get(internalId);
    }

}
