package patterns;

import java.util.Iterator;

// half pyramid with numbers
public class HalfPyramid_numbers {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			
			
			for (int j = 1; j < i; j++) {
//				print j loop for 12345 
//				print i loop for 1, 22, 333, 444, 55555
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}

//1
//12
//123
//1234
//12345