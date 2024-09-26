package a_Tricky_java;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		
		System.out.println("Please enter you age: ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.printf("You have entered %d",a);
	}
}
