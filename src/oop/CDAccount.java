package oop;

public class CDAccount extends BankAccount implements IRate{
	String interestRate;
	
	void compund() {
		System.out.println("Compounding interest");
	}

}
