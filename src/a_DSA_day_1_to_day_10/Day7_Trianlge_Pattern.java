package a_DSA_day_1_to_day_10;

public class Day7_Trianlge_Pattern {
	
	public static void main(String[] args) {
		
		int n =5;
		
		for (int i = 0; i < n; i++) {
			
//			for space 
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			
			
//			For printing stars 
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("^");
			}
			
			System.out.println();
		}
	}
}
