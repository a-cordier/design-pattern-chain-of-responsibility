package com.acordier.patterns;

import java.util.Scanner;

public class CorApp {
	
	public static void main(String[]args) {
		ATMDispenserChain atmDispenserChain = new ATMDispenserChain();
		while(true){
			int amount = 0;
			System.out.print("Enter amount: ");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if(amount % 10 != 0){
				System.out.printf("This ATM cannot dispense %s dollar amount\n", amount);
				return;
			}
			atmDispenserChain.dispense(new Currency(amount));
		}
	}
}
