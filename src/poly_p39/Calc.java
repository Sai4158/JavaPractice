package poly_p39;

public class Calc {
	//using the method overloading u can create mutiple methods 
	public void add(int a, int b) {
		
	}
	
	public void add(double a, double b, double c) {
		
	}
	
	public static void main(String[] args) {
		//use the class name to create a object 
		//beacause it is in the class 
		
		Calc a = new Calc();
		
		a.add(123, 32);
		a.add(231.2, 213.21, 3.2);
		System.out.println();
	}
}
