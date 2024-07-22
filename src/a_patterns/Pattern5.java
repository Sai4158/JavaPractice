package a_patterns;

public class Pattern5 {
	
public static void main(String[] args) {
	Pattern5 patt =  new Pattern5();
	patt.Pattern5();
	patt.pattern1();
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
