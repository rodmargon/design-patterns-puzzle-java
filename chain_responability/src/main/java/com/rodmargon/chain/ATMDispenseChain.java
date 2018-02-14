package com.rodmargon.chain;

/**
 * Hello world!
 *
 */
public class ATMDispenseChain 
{
    private DispenseChain dispenser;
	
	public ATMDispenseChain() {
		this.dispenser = new Dollar50Dispenser();
		DispenseChain dispenser20 = new Dollar20Dispenser();
		DispenseChain dispenser10 = new Dollar10Dispenser();
		dispenser20.setNextChain(dispenser10);
		dispenser.setNextChain(dispenser20);
	}
	
	
	public static void main( String[] args )
    {
        Currency amount = new Currency(70);
        ATMDispenseChain atm = new ATMDispenseChain();
        atm.dispenser.dispense(amount);
     }
}
