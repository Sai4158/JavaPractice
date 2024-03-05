package switch_p20;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the day: ");

		String day = scan.nextLine();

		switch (day) {

		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("UFF its a weekday");
			break;
		default: 
			System.out.println("Ayy it weekend");
		}
		scan.close();
	}

}
