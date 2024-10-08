package a_bubbleSort;

import java.util.*;

public class BubbleSort1 {
	public static void main(String[] args) {
		Integer[] arr = {4,4,56,5,2,1,5,7,8};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int store = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = store;
				}
			}
		}
		
		

		
//		Printing 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ",");
		}
		
//		Make sure to convert int to integer
		Arrays.sort(arr, Collections.reverseOrder());
		
//		Arrays here
		System.out.println(Arrays.toString(arr));
	}
}
