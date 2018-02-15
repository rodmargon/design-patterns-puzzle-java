package com.rodmargon.abstracfactory;

public class LuxuryCar extends Car {

	public LuxuryCar(CarType model, Location location) {
		super(model,location);
		contruct();
	}
	
	@Override
	public void contruct() {
		System.out.println("Constructing a " + toString());
	}

}
