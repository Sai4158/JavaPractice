package _B_OOPS;

	class xerox1{
		
		String branchName;
		int paperSold;
		int pricePerPaper;
		
		public xerox1(String branString, int paperSold, int pricePerPaper) {
			
			this.branchName = branString;
			this.paperSold = paperSold;
			this.pricePerPaper = pricePerPaper;
		}
		
		public void Dispaly() {
			System.out.println("Total Sold = " + paperSold);
			System.out.println("Profit = " + (paperSold * pricePerPaper));
		}
		
	}
	
	public class Part4_Inheritance {

	
	public static void main(String[] args) {
		xerox1 branch1 = new xerox1("PA", 3,5);
		
		branch1.Dispaly();
	}
	
}
