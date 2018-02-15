package com.rodmargon.abstracfactory;

public class DefaultCarFactory {

	public static Car builCar(CarType model) {
		Car car = null;
		switch(model) {
			case LUXURY:
				car = new LuxuryCar(model,Location.DEFAULT);
				break;
			case MICRO:
				car = new MicroCar(model, Location.DEFAULT);
				break;
			case MINI:
				car = new MiniCar(model, Location.DEFAULT);
				break;
			default:
				break;
		}
		return car;
	}
}
