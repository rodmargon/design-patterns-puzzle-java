package com.rodmargon.decorator;

public abstract class Pizza {
	
	protected String description = "Unknow Pizza";
	
	public String getDescription() {
		return description;
	}

	public abstract int getCost();

}
