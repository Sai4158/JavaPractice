package if_Else_p19;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("What day is it: ");
		
		// dont have to use scan.nextInt for string 
		String a = scan.next();
		
		// || is used when it is or 
		if (a.equals("monday") || a.equals("tuesday")
				|| a.equals("wednesday") || a.equals("thursday") || 
				a.equals("friday")) {
			
            System.out.println("uff, its a weekday");
		}
		else {
            System.out.println("ayy, its a weekend");

		}
	}

}
