package string_p29;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter: ");
		String a = scan.nextLine();
		
		for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
            
	}
		System.out.println("");
	     System.out.println(a);   
		
	}

}
