package ist_prac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catch_error {
	
	//this is method if to print a error if number is not 1	
	public static void amethod(int mustBeOne ) throws IllegalArgumentException {
		if(mustBeOne !=1) {
			throw new IllegalArgumentException();
		}
	}
	
	//main class
	public static void main(String[] args) {
//		try and catch thru IllegalArgumentException
		try {
			amethod(1);
			System.out.println("Good your are user 1");
		}catch(IllegalArgumentException ex) {
			System.out.println("Sorry you are not user 1 ");
		}
		
		
		
		
		
		
		
		
		
		
		
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
