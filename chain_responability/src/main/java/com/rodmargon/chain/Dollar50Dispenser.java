package com.rodmargon.chain;

public class Dollar50Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency amount) {
		if(amount.getAmount()%50==0) {
			System.out.println( "Billetes de 50 " + amount.getAmount()/50);
		} else {
			chain.dispense(amount);
		}
	}

}
