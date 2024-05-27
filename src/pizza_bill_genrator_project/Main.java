package pizza_bill_genrator_project;

public class Main {
	public static void main(String[] args) {
		
		//obj printing
		Pizza basePizza = new Pizza (false);
		
		//now the get the value
		basePizza.addExtraTopings();
		
		//now get the bill method -  where the final price is 
		basePizza.getBill();
		
	}
}
