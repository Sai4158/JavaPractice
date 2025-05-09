package a_DSA_part_61_to_part_70;

import java.util.Arrays;

public class Day67_HeightChecker {


	public static int heightChecker(int[] heights) {
		
		int n =  heights.length;
		int count = 0;
		int[] sorted  = Arrays.copyOf(heights, n);
		Arrays.sort(sorted);
		
		for (int i = 0; i < n; i++) {
			
			if( heights[i] != sorted[i]) {
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		int nums[] = {1,1,4,2,1,3};
		System.out.println(heightChecker(nums));

	}

}
