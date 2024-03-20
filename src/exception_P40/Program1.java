package exception_P40;

public class Program1 {
	public static void main(String[] args) {
		Program1 a = new Program1();
		a.method1();
		

	}
	public void method1() {
		System.out.println("program exeution start");
		int fNumber = 0;
		int sNumber = 0;
		int result = 0;
				
		
		try {
		result = fNumber/sNumber;
		
		
		}
		catch (ArithmeticException ae) {
			System.out.println(ae);
			
		}
		
		System.out.println("output is : " + result );
		System.out.println("program exeution end");
	}
}
