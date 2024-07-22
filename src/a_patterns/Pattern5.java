package a_patterns;

public class Pattern5 {
	
public static void main(String[] args) {
	Pattern5 patt =  new Pattern5();

	patt.pattern1();
	patt.pattern2();
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
