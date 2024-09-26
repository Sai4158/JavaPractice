package a_DSA_part_1_to_part_10;

public class Day7_Ben10_pattern {
    public static void main(String[] args) {
        int n = 5;

        // Upside down triangle
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print the stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Regular triangle
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print the stars
            for (int j = 0; j < 2 * i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
