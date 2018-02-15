package com.rodmargon.abstracfactory;

public abstract class CarFactory {
	private CarFactory() {}
	
	static Location location;
	
	public static Location getLocation() {
		return location;
	}

	public static void setLocation(Location location) {
		CarFactory.location = location;
	}

	public static Car buildCar(CarType model) {
		Car car = null;
		
		switch(location) {
		case USA:
			car = USACarFactory.builCar(model);
			break;
		case INDIA:
			car = IndiaCarFactory.builCar(model);
			break;
		case DEFAULT:
			car = DefaultCarFactory.builCar(model);
			break;
		default:
			break;
		}
		
		return car;
	}
}
