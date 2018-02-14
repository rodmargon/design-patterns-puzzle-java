package com.rodmargon.chain;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency amount) {
		int notes10 = amount.getAmount()/10;
		if (notes10 > 0) {
			if(amount.getAmount()%10==0) {
				System.out.println( "Billetes de 10 " + notes10);
			} else {
				System.out.println( "incorrect amount. Unable to dispense the money ");
			}
		}
	}

}
