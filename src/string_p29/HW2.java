package string_p29;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter words: ");
		String a = scan.nextLine();
		
		
		String[] s = a.split(" ");
		
		System.out.println("total: " + s.length +" words");
	}

}
