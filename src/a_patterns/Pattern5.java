package a_patterns;

public class Pattern5 {

	public static void main(String[] args) {
		Pattern5 patt =  new Pattern5();

		patt.pattern1();
		patt.pattern2();
		patt.pattern3();
		patt.pattern4();
		patt.Pattern5();	
		patt.pattern6();
		patt.pattern7();
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


	//	left Triangle 
	//	this is same as the triangle
	//	but you add extra space and remove wording spacing
	public void pattern4() {
		int n = 10;
		//		print 10 times
		for (int i = 0; i <n ; i++) {

			// remove each word spacing after it 

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



	// practice 
	public void pattern6() {
		//	this is for upside right triangle 
		//	repeat this for 5 times 
		int n = 5;
		for (int i = 0; i < n; i++) {
			
//			this is for the space
			for (int j = 0; j <i ; j++) {
				System.out.print("   ");
			}

			// this is for the word
			for (int j = i; j < n; j++) {
				System.out.print("5");
			}
			System.out.println("");
		}
	}

	//	pattern 6 -  upside down right triangle 

	public void pattern7() {
		//	this is for upside right triangle 
		//	repeat this for 5 times 
		for (int i = 0; i < 5; i++) {

			//	add a space after line
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}

			//add the symbol and then add gap after it 
			for (int j = i; j < 5; j++) {
				System.out.print("6");
			}
			System.out.println();
		}
	}

}