package _B_OOPS;


public class Part2_Constructor {

	public static void main(String[] args) {

		chai branch1 =  new chai("School",2,5);
		
		
	}


}
	 class chai {

		String branchName;
		int cupsSold;
		int pricePerCup;

		public chai(String brString, int cupSold, int pricePerCup) {
			
			System.out.println(brString + " " + cupSold +" "+pricePerCup);
			
		}
		
	}

