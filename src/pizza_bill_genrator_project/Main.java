package pizza_bill_genrator_project;

public class Main {
	public static void main(String[] args) {
		
//		//obj printing
//		Pizza basePizza = new Pizza (false);
//		
//		// add the extra item to the pizza 
//		// comment the ones you dont like
//		basePizza.addExtraTopings();
//		basePizza.takeAway();
//		basePizza.extraCheese();
//
//		
//		//now get the bill method -  where the final price is 
//		basePizza.getBill();
		
		//getting them from a diffrent class and them printing them here
		DeluxPizza dp = new DeluxPizza(true);
		dp.extraCheese();
		dp.addExtraTopings();
		dp.getBill();
		
		
	}
}
