package com.rodmargon.abstracfactory;

public class IndiaCarFactory {

	public static Car builCar(CarType model) {
		Car car = null;
		switch(model) {
			case LUXURY:
				car = new LuxuryCar(model,Location.INDIA);
				break;
			case MICRO:
				car = new MicroCar(model, Location.INDIA);
				break;
			case MINI:
				car = new MiniCar(model, Location.INDIA);
				break;
			default:
				break;
		}
		return car;
	}
}
