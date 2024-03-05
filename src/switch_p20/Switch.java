package switch_p20;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = scan.nextInt();
		
		switch (i % 2) {
		case 0: {
			System.out.println("even");
			break;
		}
		default:
			System.out.println("odd");
		}
		scan.close();
	}

}
