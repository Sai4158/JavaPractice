package a_DSA_part_1_to_part_10;

public class Day7_diamond_pattern {
	public static void main(String[] args) {
		
		
		int n = 5;
		
//		Triangle 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <2*i-1; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		
		
//		Upside down triangle
		for (int i = n; i >=0; i--) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <2*i-1; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		
	}
}



//    ^
//   ^^^
//  ^^^^^
// ^^^^^^^
//^^^^^^^^^
// ^^^^^^^
//  ^^^^^
//   ^^^
//    ^
