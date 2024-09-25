package a_DSA_day_1_to_day_10;

public class Day3_returnTypes {
	
	public static String str() {
		System.out.println("HELLO");
		return "Hello I am Sai";
	}
	
	public static boolean boo() {
		return true;
	}
	
	
	public static int in() {
		return 6969;
	}
	
	
	public static String fam(int n, String sup) {
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans = ans + sup;
		}
				return ans;
	}
	
	//main method 
	
	public static void main(String[] args) {
		
		 System.out.println(fam(4, "Sai "));
		 
		 
		 
		System.out.println(str());
		System.out.println(boo());
		System.out.println(in());
		
	}
}
