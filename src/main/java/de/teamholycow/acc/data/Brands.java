package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Brands {
	ALPINE("Alpine"),
	ASTON_MARTIN("Aston Martin"),
	AUDI("Audi"),
	BENTLEY("Bentley"),
	BMW("BMW"),
	CHEVROLET("Chevrolet"),
	FERRARI("Ferrari"),
	FORD("Ford"),
	GINETTA("Ginetta"),
	HONDA("Honda"),
	JAGUAR("Jaguar"),
	KTM("KTM"),
	LAMBORGHINI("Lamborghini"),
	LEXUS("Lexus"),
	MASERATI("Maserati"),
	MCLAREN("McLaren"),
	MERCEDES("Mercedes"),
	NISSAN("Nissan"),
	PORSCHE("Porsche");

	private final String name;
}
