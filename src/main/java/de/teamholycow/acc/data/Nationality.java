package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum Nationality {
    OTHER(0, "Other"),
    ANDORRA(49, "Andorra"),
    ARGENTINA(14, "Argentina"),
    ARMENIA(28, "Armenia"),
    AZERBAIJAN(50, "Azerbaijan"),
    AUSTRALIA(41, "Australia"),
    AUSTRIA(9, "Austria"),
    BAHRAIN(79, "Bahrain"),
    BELGIUM(7, "Belgium"),
    BRAZIL(17, "Brazil"),
    BULGARIA(51, "Bulgaria"),
    CANADA(34, "Canada"),
    CHILE(82, "Chile"),
    CHINA(35, "China"),
    CHINESE_TAIPEI(81, "Chinese Taipei"),
    COLUMBIA(47, "Columbia"),
    CROATIA(33, "Croatia"),
    CUBA(52, "Cuba"),
    CZECH_REPUBLIC(53, "Czech Republic"),
    DENMARK(32, "Denmark"),
    ENGLAND(86, "England"),
    ESTONIA(54, "Estonia"),
    FINLAND(31, "Finland"),
    FRANCE(3, "France"),
    GEORGIA(55, "Georgia"),
    GERMANY(2, "Germany"),
    GREAT_BRITAIN(5, "Great Britain"),
    GREECE(22, "Greece"),
    HONG_KONG(46, "Hong Kong"),
    HUNGARIA(6, "Hungaria"),
    INDIA(56, "India"),
    INDONESIA(38, "Indonesia"),
    IRAN(78, "Iran"),
    IRELAND(16, "Ireland"),
    ISRAEL(57, "Israel"),
    ITALY(1, "Italy"),
    JAMAICA(58, "Jamaica"),
    JAPAN(48, "Japan"),
    KUWAIT(45, "Kuwait"),
    LATVIA(59, "Latvia"),
    LEBANON(27, "Lebanon"),
    LITHUANIA(60, "Lithuania"),
    LUXEMBOURG(44, "Luxembourg"),
    MACAO(61, "Macao"),
    MADAGASCAR(84, "Madagascar"),
    MALAYSIA(62, "Malaysia"),
    MALTA(85, "Malta"),
    MEXICO(29, "Mexico"),
    MONACO(15, "Monaco"),
    NEPAL(63, "Nepal"),
    NETHERLANDS(12, "Netherlands"),
    NEW_CALEDONIA(64, "New Caledonia"),
    NEW_ZEALAND(40, "New Zealand"),
    NIGERIA(65, "Nigeria"),
    NORTHERN_IRELAND(66, "Northern Ireland"),
    NORWAY(24, "Norway"),
    OMAN(21, "Oman"),
    PAPUA_NEW_GUINEA(67, "Papua New Guinea"),
    PHILIPPINES(68, "Philippines"),
    POLAND(13, "Poland"),
    PORTUGAL(36, "Portugal"),
    PUERTO_RICO(19, "Puerto Rico"),
    QATAR(69, "Qatar"),
    RUMANIA(70, "Rumania"),
    RUSSIA(10, "Russia"),
    SAN_MARINO(42, "San Marino"),
    SAUDI_ARABIA(23, "Saudi Arabia"),
    SCOTLAND(72, "Scotland"),
    SERBIA(72, "Serbia"),
    SINGAPORE(37, "Singapore"),
    SLOVAKIA(20, "Slovakia"),
    SLOVENIA(73, "Slovenia"),
    SOUTH_AFRICA(18, "South Africa"),
    SOUTH_KOREA(26, "South Korea"),
    SPAIN(4, "Spain"),
    SWEDEN(30, "Sweden"),
    SWITZERLAND(8, "Switzerland"),
    TAIWAN(74, "Taiwan"),
    THAILAND(11, "Thailand"),
    TURKEY(25, "Turkey"),
    UKRAINE(75, "Ukraine"),
    UNITED_ARAB_EMIRATES(43, "United Arab Emirates"),
    URUGUAY(83, "Uruguay"),
    USA(39, "USA"),
    VENEZUELA(76, "Venezuela"),
    WALES(77, "Wales"),
    ZIMBABWE(80, "Zimbabwe");

    private final int id;
    private final String displayName;

    private final static Map<Integer, Nationality> NATIONALITY_LOOKUP = new HashMap<>();

    static {
        for (Nationality nationality : Nationality.values()) {
            NATIONALITY_LOOKUP.put(nationality.getId(), nationality);
        }
    }

    public static Nationality get(Integer id) {
        return NATIONALITY_LOOKUP.get(id);
    }
}
