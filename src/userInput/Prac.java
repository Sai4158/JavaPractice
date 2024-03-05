package userInput;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Where are u from");
		String how = scanner.nextLine();
		
		System.out.printf("%s is very cool place! \n", how);
		System.out.println("what do you like to do");
		
		String like = scanner.nextLine();
		System.out.printf("%s damnn u are insane! \n",like);
		
		System.out.println("Thank you!!");
		
		scanner.close();
	}

}
