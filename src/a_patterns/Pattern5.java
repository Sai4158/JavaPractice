package a_patterns;

public class Pattern5 {
	public static void main(String[] args) {
//		Inverted Pyramid Star Pattern
		
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
