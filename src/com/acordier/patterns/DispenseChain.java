package com.acordier.patterns;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency currency);
}
