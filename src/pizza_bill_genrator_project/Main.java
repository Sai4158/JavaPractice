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
		//Encapsulating
		DeluxPizza dp = new DeluxPizza(false);
		dp.extraCheese();
		dp.addExtraTopings();
		dp.getBill();
		dp.extraChicken();
		
		
//		Pizza: 300
//		Extra cheese added: 100
//		Extra toppings added: 150
//		Extra chicken added: 200
//		bill: 1000
		
		
	}
}
