package com.rodmargon.abstracfactory;

public class MicroCar extends Car {

	public MicroCar(CarType model, Location location) {
		super(model,location);
		contruct();
	}
	
	@Override
	public void contruct() {
		System.out.println("Constructing a " + toString());
	}

}
