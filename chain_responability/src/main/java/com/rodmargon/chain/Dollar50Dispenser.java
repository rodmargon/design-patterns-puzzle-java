package com.rodmargon.chain;

public class Dollar50Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency amount) {
		int notes50 = amount.getAmount()/50;
		if (notes50 > 0) {
			System.out.println( "Notes of 50 " + notes50);
			int remainder = amount.getAmount()%50;
			if(remainder > 0) {
				chain.dispense(new Currency(remainder));
			}
		} else {
			chain.dispense(amount);
		}
	}

}
