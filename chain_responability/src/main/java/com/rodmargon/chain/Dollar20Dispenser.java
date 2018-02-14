package com.rodmargon.chain;

public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency amount) {
		int notes20 = amount.getAmount()/20;
		if (notes20 > 0) {
			System.out.println( "Notes of 20 " + amount.getAmount()/20);
			int remainder = amount.getAmount()%20;
			if(remainder > 0) {
				chain.dispense(new Currency(remainder));
			}
		} else {
			chain.dispense(amount);
		}
	}

}
