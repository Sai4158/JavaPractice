package a_DSA_part_11_to_part_20;

import java.util.Arrays;

public class Day10_ArryaSort {
	public static void main(String[] args) {
		
		int arr[] = {4,4,3,4,6,23,34,67,72};
		
		Arrays.sort(arr);
	
		
		
		
		for (int i = arr.length-1; i >= 0; i--) {
			
			System.out.println(arr[i]);
		}
	}
}


//3
//4
//4
//4
//6
//23
//34
//67
//72

//72
//67
//34
//23
//6
//4
//4
//4
//3

