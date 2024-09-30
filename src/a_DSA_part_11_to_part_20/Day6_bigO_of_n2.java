package a_DSA_part_11_to_part_20;

public class Day6_bigO_of_n2 {
//	This is big o of n2
	
	public static void main(String[] args) {
		
//		double for loop to print a triangle 
		
		int n =5;
		
		for (int i = 0; i < n; i++) {
			
//			This is for space
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");

			}
			
//			This is for printing the stars 
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	}
}
