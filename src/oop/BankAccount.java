package oop;

public class BankAccount implements IRate{
//	Define variables
	String accountNumber;
	
//	Static >> belongs to the CLASS not the object instance
//	Final >> constant (often static final)
	static final String sortCode = "013456";
	
//	Instance variables
	private String name;
	private String nin;
	String accountType;
	double balance = 0;
	
//	Constructor definitions: unique methods
//	1) They are used to define /setup / initialise properties of an object
//	2) Constructors are IMPLICITLY called upon INSTANTIATION
//	3) The same name as the class itself
//	4) Constructors have NO return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
//	Overloading: Call same method name with different arguments
//	This is also an example of polymorphism through overloading.
	BankAccount(String accountType){
		System.out.println("New account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
//		initDeposit, accountType, Msg are all local variables
		System.out.println("New account: " + accountType);
		System.out.println("Initial deposit of: £ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be at least £1,000";
		} else {
			Msg = "Thanks for your initial deposit of: £" + initDeposit; 
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	
//	Getters / Setters
	
//	Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	public String getName() {
		return name;
	}
	
	public String getNin() {
		return nin;
	}
	public void setNin(String nin) {
		this.nin = nin;
	}
	
	
//	Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	//	Define methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSITE");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw");
	}
	
//	Private: Can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: £" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT# " + accountNumber + ". SORT CODE: " + sortCode + ". BALANCE: £" + balance + " ]";
	}

}
