package a_DSA_part_11_to_part_20;

import java.util.Scanner;

public class Day9_inputInJava {
	
	public static void main(String[] args) {
		

//		Scanner
		Scanner sc = new Scanner(System.in);
		
//		Ask the user 
		System.out.print("Enter the number to multiply: ");
		
//		Store the value
		int a =  sc.nextInt();
				
		
//		Use a for loop to print tables until 10 
		
		int n = 10;
		
		for (int i = 0; i <=n; i++) {
			int b =  a * i;
			
			System.out.println(a + " X " + i + " = " + b );
		}
		
	}
}


//Enter the number to multiply: 5
//5 X 0 = 0
//5 X 1 = 5
//5 X 2 = 10
//5 X 3 = 15
//5 X 4 = 20
//5 X 5 = 25
//5 X 6 = 30
//5 X 7 = 35
//5 X 8 = 40
//5 X 9 = 45
//5 X 10 = 50