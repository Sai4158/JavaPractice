package a_DSA;

public class Day7_Hallow_Diamond {
	public static void main(String[] args) {

		int n =5;

		
		for (int i = 0; i <n; i++) {

			//	          First for loop is for space
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}

			//	          Second is for the printing stars
			for (int j = 1; j <= 2 * i - 1; j++) {

				//	              Print '*' if on the first or last row or first/last column
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		for (int i = n; i > 0; i--) {

			// First for loop is for space
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}

			// Second is for the printing stars
			for (int j = 1; j <= 2 * i - 1; j++) {

// 				Print '*' if on the first or last row or first/last column
//				Remove I == n - so it will be a Hallow diamond
				if ( j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
