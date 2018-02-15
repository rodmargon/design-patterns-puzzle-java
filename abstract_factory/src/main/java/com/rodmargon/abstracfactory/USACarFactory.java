package com.rodmargon.abstracfactory;

public class USACarFactory {

	public static Car builCar(CarType model) {
		Car car = null;
		switch(model) {
			case LUXURY:
				car = new LuxuryCar(model,Location.USA);
				break;
			case MICRO:
				car = new MicroCar(model, Location.USA);
				break;
			case MINI:
				car = new MiniCar(model, Location.USA);
				break;
			default:
				break;
		}
		return car;
	}
}
