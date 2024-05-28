package pizza_bill_genrator_project;

public class Pizza {
	private int price;
	private Boolean veg;

	//setting the price for each options
	private int extraCheeseprice = 100;
	private int addExtraTopingsprice = 150;
	private int backPackprice = 20;
	private int extraChickenPrice = 200;
	private int baseprice;
	

	private boolean isExtraCheeseAdded = false;
	private boolean isExtraTopping= false;
	private boolean isoptedForTakeAway= false;
	private boolean extraChickenAdded = false;

	public Pizza(Boolean veg) {

		this.veg = veg;

		//if the price of the pizza is a 300 then set it to 400
		//if veg it is 300
		//if its not veg then it is 400

		if(this.veg) {

			this.price = 300;
		}else {
			this.price = 400;
		}
		baseprice = this.price;
	}

	//methods 

	//extraCheese 
	public void extraCheese() {
		isExtraCheeseAdded = true;

		//adding extra to the price 
		this.price += extraCheeseprice;

	}

	//extraChicken
	public void extraChicken() {
		extraChickenAdded = true;

		//adding extra Chicken to the price 
		this.price += extraChickenPrice;

	}

	//addExtraTopings 
	public void addExtraTopings() {
		isExtraTopping= true;

		//adding extra to the price 
		this.price += addExtraTopingsprice;
	}

	//takeAway 
	public void takeAway() {
		isoptedForTakeAway = true;
		this.price += backPackprice;
	}


	//getBill 
	public void getBill() {

		String bill = "";
		System.out.println("Pizza: " + baseprice );
		if(isExtraCheeseAdded) {
			bill += "Extra cheese added: " + extraCheeseprice + "\n";		
		}
		if(isExtraTopping) {
			bill += "Extra toppings added: " + addExtraTopingsprice + "\n";		
		}
		if(isoptedForTakeAway) {
			bill += "Take away: " + backPackprice + "\n";

		}
		if(extraChickenAdded) {
			bill += "Extra chicken added: " + extraChickenPrice + "\n";

		}
		bill += "bill: " + this.price + "\n";

		System.out.println(bill);

	}


}
