package if_Else_p19;

import java.io.Reader;
import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		//get this from the Scanner read above
		//int only 127 max, long have many numbers
		long a = scan.nextInt();
		
		//% remider is divisble by 2 then even
		
		if(a%2 == 0) {
			System.out.println("this is a even number");
		}
		else {
			System.out.println("This is a odd number");
		}
		//Close scanner
		scan.close();
	}
}
