package switch_p20;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number: ");

		int a = scan.nextInt();

		System.out.print("Enter your second number: ");

		int b = scan.nextInt();

		System.out.println("Enter your operation: ");
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		switch (c) {
		case '+': {

			d=(a+b);
			break;
		}
		case '-': {

			d=(a-b);
			break;
		}
		case '*': {

			d=(a*b);
			break;
		}
		case '/': {

			d=(a/b);
			break;
		}

		default:
			System.out.println("only enter *,/,+,- ");
		
		}
		System.out.println(d);
		scan.close();
	}

}
