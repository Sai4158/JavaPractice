package pizza_bill_genrator_project;

public class Pizza {
	private int price;
	private Boolean veg;


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
	//printing using a constructor
	public void getPizzaPrice() {
		System.out.println(this.price);
	}

}
