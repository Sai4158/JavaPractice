package string_p29;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter: ");
		String a = scan.nextLine();
		
		System.out.println("enter ur letter: ");
		char targetChar = scan.nextLine().charAt(0);
		
		int c =0;
		for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == targetChar) {
                c++;
			
		}
	}
		 System.out.println("The character '" + targetChar + "' appears " + c + " times.");

	        scan.close();

}
}
