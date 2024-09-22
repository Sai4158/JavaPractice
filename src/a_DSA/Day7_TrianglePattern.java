package a_DSA;

public class Day7_TrianglePattern {
	public static void main(String[] args) {
		
		int n =10;
		
		for (int i = 0; i < n; i++) {
		
//			for spaces 
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
//			for stars - make sure to times 2 print on the left and the right 
			for (int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}


//	  *
//   * *
//  * * *
// * * * *
