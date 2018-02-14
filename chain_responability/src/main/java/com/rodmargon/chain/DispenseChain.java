package com.rodmargon.chain;

public interface DispenseChain {
	
	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency amount);

}
