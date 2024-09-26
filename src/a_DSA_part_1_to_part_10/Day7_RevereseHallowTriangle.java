package a_DSA_part_1_to_part_10;

public class Day7_RevereseHallowTriangle {
    public static void main(String[] args) {

//      This is reversed triangle

        int n = 5;
        

        for (int i = n; i > 0; i--) {

//          First for loop is for space
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

//          Second is for the printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {

//              Print '*' if on the first or last row or first/last column
                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
