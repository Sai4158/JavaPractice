package a_patterns;

import java.util.Iterator;

public class Halllow_Diamond {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {

			//			first loop for the space 

			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}

			//			Second loop - for printing
			for (int j = 1; j <= 2 * i - 1; j++) {
				
				if (j == 1 || j == 2 * i -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}

		
		
		
		//		reversed
		for (int i = n; i>0; i--) {

			//			first loop for the space 

			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}

			//			Second loop - for printing
			for (int j = 1; j <= 2 * i - 1; j++) {
				
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}
	}
}
