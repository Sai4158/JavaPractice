package a_patterns;

public class Diamond_Pattern {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i < n; i++) {

			//				For space
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}

			//				For stars
			for (int j = 0; j <2*i-1 ; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}


		for (int i = n; i >0; i--) {

			//				For space
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}

			//				For stars
			for (int j = 0; j <2*i-1 ; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}
}


//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
