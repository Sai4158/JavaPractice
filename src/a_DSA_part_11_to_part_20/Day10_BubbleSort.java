package a_DSA_part_11_to_part_20;

import java.util.Iterator;

public class Day10_BubbleSort {
	
	public static void main(String[] args) {
			
		int arr[] = {4,5,6,1,4};
		
//		Printing the sorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp; 
					
				}
			}
		}
		
		System.out.println();
		System.out.println("After bubble sort");
//		Printing the sorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
