package com.acordier.patterns;

public class ATMDispenserChain {
	
	private DispenseChain chain;
	
	public ATMDispenserChain(){
		/* chaining the responsibility */
		DispenseChain chain10 = new Dollar10Dispenser();
		DispenseChain chain20 = new Dollar20Dispenser();
		chain20.setNextChain(chain10);
		this.chain = new Dollar50Dispenser();
		this.chain.setNextChain(chain20);
	}
	
	public void dispense(Currency currency){
		this.chain.dispense(currency);
	}
	
}
