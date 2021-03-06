package com.rodmargon.decorator;

public class FreshTomato extends ToppingsDecorator {

	private Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public FreshTomato(Pizza pizza) {
		setPizza(pizza);
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + " with Fresh tomato";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 15;
	}

}
