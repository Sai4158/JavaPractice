package _B_OOPS;


public class Part2_Constructor {

	public static void main(String[] args) {

		chai branch1 =  new chai("School",2,5);
		chai branch2 =  new chai("Maimi", 2,45);
		chai branch3 =  new chai("FL", 2,45);
		branch1.display();
		branch2.display();
		branch3.display();
		branch3.display();
	}


}
	 class chai {

		String branchName;
		int cupsSold;
		int pricePerCup;

		public chai(String branchName, int cupsSold, int pricePerCup) {
			
//			System.out.println(branchName + " " + cupsSold +" "+pricePerCup);
	        this.branchName = branchName;
	        this.cupsSold = cupsSold;
	        this.pricePerCup = pricePerCup;
		}
		
		public void display() {
			System.out.println(branchName);
			System.out.println();
			System.out.println(cupsSold);
			System.out.println();
			System.out.println(pricePerCup);
		}
		
	}

