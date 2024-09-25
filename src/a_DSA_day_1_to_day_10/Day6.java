package a_DSA_day_1_to_day_10;

public class Day6 {
	public static void main(String[] args) {
		
		
//		This will print a patterns 
		
		int c = 5;
		
		for (int i = 0; i < c; i++) {
			
			
			for (int j = 0; j < c-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <c; j++) {
				System.out.print("*");

			}
			
			
			for (int j = 0; j <c; j++) {
				System.out.print(" *");

			}
			
			
			System.out.println(" ");
		}
	}
}


