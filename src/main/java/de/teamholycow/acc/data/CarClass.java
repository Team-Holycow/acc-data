package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
@RequiredArgsConstructor
public enum CarClass {
	FREE_FOR_ALL("FreeForAll"),
	GT3("GT3"),
	GT4("GT4"),
	GTC("GTC"),
	TCX("TCX"),
	ST("ST"),
	CUP("CUP"),
	GT2("GT2"),
	FERRARI_CHALLENGE("FC");

	private final String internalId;

	private final static Map<String, CarClass> CAR_CLASS_LOOKUP = new HashMap<>();

	static {
		for (CarClass carClass : CarClass.values()) {
			CAR_CLASS_LOOKUP.put(carClass.getInternalId(), carClass);
		}
	}


	public static CarClass get(int carId, String internalId) {
		// some cars are not correctly classified in the json file
		if (carId >= 80 && carId <= 87) {
			return CarClass.GT2;
		}

		if (carId >= 50 && carId <= 61) {
			return CarClass.GT4;
		}

		if (carId == 18 || carId == 29) {
			return CarClass.ST;
		}

		if (carId == 9 || carId == 28) {
			return CarClass.CUP;
		}

		if (carId == 26) {
			return CarClass.FERRARI_CHALLENGE;
		}

		if (carId == 27) {
			return CarClass.TCX;
		}

		return CAR_CLASS_LOOKUP.get(internalId);
	}
}
