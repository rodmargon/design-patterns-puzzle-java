package com.rodmargon.abstracfactory;

public abstract class Car {

	private CarType model;
	private Location location;
	
	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	Car(CarType model, Location location){
		this.model = model;
		this.location = location;
	}
	
	public abstract void contruct();
	
	@Override
    public String toString()
    {
        return "CarModel - "+model + " located in "+location;
    }
}
