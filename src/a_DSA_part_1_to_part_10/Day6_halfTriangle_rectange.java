package a_DSA_part_1_to_part_10;

public class Day6_halfTriangle_rectange {
	public static void main(String[] args) {
		 int n = 5;
		 
		 for (int i = 0; i < n; i++) {
			
//			 second loop 
			 for (int j = 0; j <n-i-1 ; j++) {
				System.out.print(" ");
			}
			 
			 
//			 third loop : print
			 for (int j = 0; j < n-1+i; j++) {
				System.out.print("*");
			}
			 
			 System.out.println();
			 
		}
	}
}
//    ****
//   *****
//  ******
// *******
//********