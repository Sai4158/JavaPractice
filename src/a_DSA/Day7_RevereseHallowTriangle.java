package a_DSA;

public class Day7_RevereseHallowTriangle {
	public static void main(String[] args) {
		
		
//		This is reversed triangle
		
		int n =5;
		
		for (int i = n; i >0; i--) {
			
//			First for loop is for space
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			
//			Second is for the printing Stars
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
