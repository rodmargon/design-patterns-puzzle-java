package com.rodmargon.decorator;

public class Paneer extends ToppingsDecorator {

private Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public Paneer(Pizza pizza) {
		setPizza(pizza);
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + " with Paneer";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 10;
	}

}
