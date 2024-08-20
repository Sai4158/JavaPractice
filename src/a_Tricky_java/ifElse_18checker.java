package a_Tricky_java;

import java.util.Scanner;

public class ifElse_18checker {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter youre age: ");
		int age = sc.nextInt();
		
		if(age >18) {
			System.out.println("you are a adult");
		}
		else {
			System.out.println("NOT ADULT");

		}
	}
}
