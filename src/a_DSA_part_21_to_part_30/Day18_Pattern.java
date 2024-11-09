package a_DSA_part_21_to_part_30;

public class Day18_Pattern {
	public static void main(String[] args) {
		
		
		int n = 5;
		
		
		for (int i = 0; i <n; i++) {
			
//			Space 
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <2*i-1 ; j++) {
				System.out.print("!");

			}
			System.out.println();

		}
		
	}
}
