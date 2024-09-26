package a_DSA_part_1_to_part_10;

public class Day7_Reversed_increasing_Triangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

        	//	Loop for the space
        	for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
        	
        	
            // Loop to print numbers in decreasing order for each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j );
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
