package static_30;

import java.util.jar.Attributes.Name;

public class Test2{
	
	int number;
	
	
	public Test2() {
		System.out.println("wassup");
		number = 10;
		Test1 st = new Test1();
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(Test1.sai);
		
		Test2 t1 = new Test2();
		System.out.println(t1.number);
	}
	
}
