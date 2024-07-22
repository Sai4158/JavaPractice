package a_patterns;

public class Pattern5 {

	public static void main(String[] args) {
		Pattern5 patt =  new Pattern5();

		patt.pattern1();
		patt.pattern2();
		patt.pattern3();
		patt.Pattern5();
	}


	// basic pattern - cube 
	public void pattern1() {
		System.out.println("");
		for(int i = 0; i<=5; i++) {
			for(int j = 0; j<=5; j++) {
				System.out.print(" % ");
			}
			System.out.println("");
		}
	}


	//triangle

	public void pattern2() {
		//	how many rows -  5
		for (int i = 0; i <5; i++) {

			//		gap after each line
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}

			//		print o after each for loop 
			for (int j = 0; j < i; j++) {
				System.out.print("O ");
			}
			//		new line after each loop
			System.out.println();
		}
	}

//	Right Triangle 
//	this is same as the triangle
//	but you add extra space 
	public void pattern3() {
		int n = 10;
//		print 10 times
		for (int i = 0; i <n ; i++) {

//			print gap after each line and then 10 times
//			add extra space here for the right triangle
			for (int j = i; j <n; j++) {
				System.out.print("  ");
			}

//			print the star after 
			for (int j = 0; j< i; j++) {
				System.out.print("1 ");

			}
			
			System.out.println();
		}
	}

	//Inverted Pyramid Star Pattern - reverse triangle
	public void Pattern5() {	
		System.out.println("");

		//		repeat this for 5 times 
		for (int i = 0; i < 5; i++) {

			//			add a space after line
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}

			//			add the symbol and then add gap after it 
			for (int j = i; j < 5; j++) {
				System.out.print("S ");
			}
			System.out.println();
		}
	}


}
