package a_DSA_day_1_to_day_10;

public class Day7_Increasing_Pattern_Triangle {

	public static void main(String[] args) {
		int n = 5;

		// Outer loop to control the rows
		for (int i = 1; i <= n; i++) {

			
			// Loop for printing spaces 
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			// Loop to print numbers in reverse
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}

			// Initialize temp variable for increasing numbers
			int temp = 2;  
			
			// Loop to print numbers in increasing
			// Make sure to put temp at 1 and j starts 1 		
			for (int j = 1; j < i; j++) {
				System.out.print(temp++);
			}

			// Move to the next line after each row
			System.out.println();
		}

	}
}
