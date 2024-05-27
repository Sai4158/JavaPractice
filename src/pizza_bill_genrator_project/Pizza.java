package pizza_bill_genrator_project;

public class Pizza {
	private int price;
	private Boolean veg;

	//setting the price for each options
	private int extraCheeseprice = 100;
	private int addExtraTopingsprice = 150;
	private int backPackprice = 20;

	
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

	}

	
	//methods 
	
	//extraCheese 
	public void extraCheese() {
		System.out.println("Extra chesse is added");
		//adding extra to the price 
		this.price += extraCheeseprice;
	}
	
	//addExtraTopings 
	public void addExtraTopings() {
		System.out.println("Extra topping is added");

		//adding extra to the price 
		this.price += addExtraTopingsprice;
	}

	//takeAway 
	public void takeAway() {
		System.out.println("Take out opted");
		this.price = backPackprice;
	}


	//getBill 
	public void getBill() {
		//will print the final price of the pizza
		System.out.println(this.price);
	}

}
