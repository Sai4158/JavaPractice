package ist_prac;
// double click on the left blue side navbar to debug
public class Debugging {
	public static void main(String[] args) {
		
		String hello = "Hello";
		String world = String.format("%s World", hello);
				
		System.out.println(world);
		//Hello World
		
		
		
//		----------
		System.out.println(concat("Hello", "I am Sai"));
	}
	
	
	public static String concat(String a, String b) {
		return String.format("%s,%s", a, b);
	
	}

}

