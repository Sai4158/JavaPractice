package a_DSA_part_11_to_part_20;

import java.util.Arrays;

public class Day15_2DArray {
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <= arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
//		This will only print first set
		System.out.println(Arrays.toString(arr[0]));
//		[1, 2, 3]
	}
}

//1
//2
//3
//4
//5
//6