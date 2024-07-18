package bankingApp;

public class Account {
	private String Number;
	private double Balance;
	private String  Name;
	private String Email;
	private	String Phone;

	//constructor
	public  Account(String Number, double Balance, String  Name, String Email, String Phone) {
		this.Number = Number;
		this.Balance = Balance;
		this.Name = Name;
		this.Email = Email;
		this.Phone = Phone;

	}

	//deposit method 
	public void depositemoney(double depositedmoney) {
		this.Balance+=depositedmoney;
		System.out.println("Deposit done, new balance is " + this.Balance);
	}

	//withdraw money 
	public void withdrawmoney(double Withdrawedmoney) {
		//if amount less 0 say no, if else withdraw the amount
		if(this.Balance - Withdrawedmoney <0) {
			System.out.println(" negative amount");
		} else {
			this.Balance -=  Withdrawedmoney;
			System.out.println("Withdraw successful, current balance " + this.Balance);

		}
		int a =100;
		int b =200;
		int c=300;
		
		System.out.printf("%d + %d + %d ", a, b, c);
	}

	//get and set methods
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

}
