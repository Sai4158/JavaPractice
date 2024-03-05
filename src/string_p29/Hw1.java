package string_p29;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter your words: ");
		
		//make sure to put nextLine or else it wont read spaces
		String s1 = scan.nextLine( );
		
		System.out.println("your letter lenght is: " + s1.length());
		
		
	scan.close();
	}

}

/*
 * 
enter your words: 
java is super
your letter lenght is: 13
 */
