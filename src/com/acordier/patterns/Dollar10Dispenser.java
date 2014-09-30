package com.acordier.patterns;


public class Dollar10Dispenser implements DispenseChain {
	
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain; 
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount()>=10){
			int q = currency.getAmount() / 10;
			int r = currency.getAmount() % 10;
			System.out.printf("Dispensing %s *10$\n", q);
			if(r != 0){
				this.chain.dispense(new Currency(r));
			}
		}
		else this.chain.dispense(currency); 
	}

}
