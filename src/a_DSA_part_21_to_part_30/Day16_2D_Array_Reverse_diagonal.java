package a_DSA_part_21_to_part_30;

import java.util.Iterator;

public class Day16_2D_Array_Reverse_diagonal {
	public static void main(String[] args) {
		
		int arr[][] = {{34,43,45},{43,54,65},{45,56,64}};
		
		int n = arr.length-1;
		
		for (int i = 0; i <= n; i++) {
			System.out.println(arr[n-i][n-i]);
		}
		
		System.out.println(arr[0][1]);
//		43
	}
}


//		64
//	54
//34