package exception_P43;

public class Program3 {
	public static void main(String[] args) {
		
		//if this error happens 
		try {
			System.out.println(1/0);
		} 
		
		//
		catch (ArithmeticException e) {
			//display a custom errors message
			throw new ArithmeticException ("Idiot u can not divide by ZERO");
		}
	}
}
