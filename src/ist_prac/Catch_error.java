package ist_prac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catch_error {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num");
				
		try {
			int n  = sc.nextInt();
			System.out.println("you have entered num: "+n);
		} catch(InputMismatchException ex) {
			System.out.println("Try again thats not a int.");
		}
		
		
	}
}
