package a_DSA_part_11_to_part_20;

import java.util.Scanner;

public class Day9_ArrayInput {
	public static void main(String[] args) {
		
// Taking array as input
		
//		Scanner
		Scanner sc = new Scanner(System.in);
		
		
//		Ask the user 
		System.out.print("Enter array of numbers ");
		
//		Save
		int[] arr = new int[3];
		
//		scan - for loop
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		

			
//		Print
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
