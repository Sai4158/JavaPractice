package a_DSA;

public class Day3_printingStringBasedOnNum {
	public static void main(String[] args) {
		
		String s  = "Sai";
		int n = 3;
		
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
		
//		instead of this, we can make a function for it 
//		we can call the function here 
		fun("Sauu", 5);
	}
	
	public static void fun(String s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
	}
}
