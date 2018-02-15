package com.rodmargon.abstracfactory;

public class MiniCar extends Car {

	public MiniCar(CarType model, Location location) {
		super(model,location);
		contruct();
	}
	
	@Override
	public void contruct() {
		System.out.println("Constructing a " + toString());
	}

}
