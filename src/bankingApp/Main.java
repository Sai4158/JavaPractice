package bankingApp;

public class Main {
	public static void main(String[] args) {
		
		Account sai = new Account("12345", 0.0, "sai", "Saai@gmail.com", "99999");
		
	
		//this will add 100
		sai.depositemoney(100);
		
		//now I will remove 20
		sai.withdrawmoney(20);
		
		//Now I want to remove 100 
		sai.withdrawmoney(100);
		
		
//		Deposit done, new balance is 100.0
//		Withdraw successful, current balance 80.0
//		Withdraw not done negative amount
		
	}
}
