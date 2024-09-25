package a_DSA_day_1_to_day_10;

public class Day7_Triangle_number_Patter {
	public static void main(String[] args) {


		int n =6;

		// Run the loop 6 times 
		for (int i = n; i >0;i--) {

			// Add a temp variable here so it will reset to 1 after every for loop 
			int temp = 1;

			// n-i for the patter to print
			for (int j = 0; j <= n-i; j++) {

				// Temp++ to increase the values for the temp 
				System.out.print(temp++);
			}
			System.out.println();
		}
	}
}
