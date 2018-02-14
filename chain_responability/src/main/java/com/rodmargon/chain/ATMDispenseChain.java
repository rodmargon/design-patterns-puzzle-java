package com.rodmargon.chain;

import java.util.Scanner;

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
        while(true) {
        	int  amount = 0;
        	System.out.println("Enter amount to dispense");
        	Scanner input = new Scanner(System.in);
        	amount = input.nextInt();
        	if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
        	Currency currency = new Currency(amount);
	        ATMDispenseChain atm = new ATMDispenseChain();
	        atm.dispenser.dispense(currency);
        }    
     }
}
