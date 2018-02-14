package com.rodmargon.chain;

public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency amount) {
		if(amount.getAmount()%20==0) {
			System.out.println( "Billetes de 20 " + amount.getAmount()/20);
		} else {
			chain.dispense(amount);
		}
	}

}
