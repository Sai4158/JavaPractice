package a_Tricky_java;

import java.util.Scanner;

public class ODD_EVEN {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		var num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("This is a EVEN number");
		}
		else {
			System.out.println("This is a ODD number");

		}
		
	}
}
