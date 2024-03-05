package switch_p20;

import java.util.Scanner;

public class Swwit {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ur age: ");
		
		int i = scan.nextInt();

		switch (i) {
		
		case 33: {
			System.out.println("you are 33!");
			break;
		}

		case 34: {
			System.out.println("you are 34!");
			break;
		}
		
		default:
			System.err.printf("u aint 32!, u are %d", i);
	
		}
	}
}
