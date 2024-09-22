package a_DSA;

public class Day7_TrianglePattern {
	public static void main(String[] args) {
		
		int n =10;
		
		for (int i = 0; i < n; i++) {
		
//			for spaces 
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
//			for stars - add space for the alignment 
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
}
