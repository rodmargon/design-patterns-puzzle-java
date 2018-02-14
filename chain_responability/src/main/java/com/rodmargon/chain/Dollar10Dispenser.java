package com.rodmargon.chain;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency amount) {
		if(amount.getAmount()%10==0) {
			System.out.println( "Billetes de 10 " + amount.getAmount()/10);
		} else {
			System.out.println( "incorrect amount. Unable to dispense the money ");
		}
	}

}
