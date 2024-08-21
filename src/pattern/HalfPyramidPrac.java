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
		

//		This is reverse pyramid 

		
		for (int i = 6; i >=1; i--) {
			System.out.print(" ");

			for (int j = 0; j <i; j++) {
				System.out.print("^");
			}
			System.out.println();

		}
	}
}



//^
//^^
//^^^
//^^^^
//^^^^^
//^^^^^^
//^^^^^
//^^^^
//^^^
//^^
//^
