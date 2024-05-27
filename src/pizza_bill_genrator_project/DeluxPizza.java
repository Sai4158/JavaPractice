package pizza_bill_genrator_project;

public class DeluxPizza extends Pizza{

	//make a constructor 
	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addExtraTopings();
		super.extraCheese();
		
	}

	@Override
	public void extraCheese() {
		// TODO Auto-generated method stub
		super.extraCheese();
	}

	@Override
	public void addExtraTopings() {
		// TODO Auto-generated method stub
		super.addExtraTopings();
	}
	
	
}
