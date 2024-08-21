package pattern;

import java.util.Iterator;

public class HalfPyramidPrac {
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=5 ; i++) {
			System.out.print(" ");
			for (int j = 1; j <=i; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
	}
}
