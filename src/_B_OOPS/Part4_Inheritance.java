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
		
		public void fun() {
			System.out.println("fun 1");
		}
		
		public void fun(int a) {
			System.out.println("fun 2");
		}
		
		public void fun(int a, int b) {
			System.out.println("fun 3");
		}
		
		public void fun(boolean a, int b) {
			System.out.println("Answer: " + (a ? "true" : "false"));
		}
		
	
		
	}
	
	public class Part4_Inheritance {

		
		
	public static void main(String[] args) {
		xerox1 branch1 = new xerox1("PA", 3,5);
		
		branch1.Dispaly();
		
		branch1.fun();
		branch1.fun(2);
		branch1.fun(3,4);
		branch1.fun(false,4);

	
		
	}
	
}
