package _B_OOPS;


public class Part3_OOPS {

	public static void main(String[] args) {
		
		chaiShop Branch1 =  new chaiShop("Apple",2,6);
		Branch1.display();
		Branch1.revenue();
		
	}
}


class chaiShop{
	String branchName;
	int cupsSold;
	int pricePerCup;


	public chaiShop (String branchName, int cupsSold, int pricePerCup) {
        this.branchName = branchName;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
	}

	public void display() {

	}

	public void classfun() {

	}

	public void revenue() {
		
		System.out.println("Revenue = " + (cupsSold * pricePerCup));
	}

}