package a_patterns;

public class Pattern7 {
	
	public static void main(String[] args) {
		
//		Simple triangle 
		
		int n =  5;
		
		for (int i = 0; i < n; i++) {
//			This is for spaces 
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			
//			This is for printing 
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
}
