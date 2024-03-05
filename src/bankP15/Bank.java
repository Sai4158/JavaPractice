package bankP15;

public class Bank {
	
	static int currentBlance = 1000;
	
	public static void greetings() {
		//method body 
		System.out.println("Hello, Welcome to the banking application");
		
	}
	
	public void deposit(int amount) {
		currentBlance = currentBlance + amount;
		System.out.println("Amount is deposited successfully");
	}
	public static void withdrawal(int amount) {
		currentBlance = currentBlance - amount;
		System.out.println("Amount is withdrawal successfully");
	}
	public int getCurretnBlance() {
		return currentBlance;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetings();
		System.out.println("Current balance is : "+bank.currentBlance);
		bank.deposit(500);
		System.out.println("Current balance is : "+bank.currentBlance);
		withdrawal(300);
		System.out.println("Current balance is : "+bank.currentBlance);

		
	}
}
