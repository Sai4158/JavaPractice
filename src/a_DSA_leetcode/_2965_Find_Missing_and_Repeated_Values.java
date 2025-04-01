package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class _2965_Find_Missing_and_Repeated_Values {

	public static int[] findMissingAndRepeatedValues(int[][] grid) {

		int  n = grid.length;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		// Put all the values in the HashMap and count them
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				int val = grid[i][j]; 
				hm.put(val, hm.getOrDefault(val, 0) + 1);  
			}
		}



		int rep =  -1;
		int miss = -1;


		int size =  n * n;

//		If a number appears 2 times, then it's the repeated number
		
//		If a number appears 0 times, it’s the missing number
		
		for (int i = 1; i <= size; i++) {

			int freq =  hm.getOrDefault(i, 0);

			if(freq ==2) {
				rep = i;
			}else if(freq == 0) {
				miss =  i;
			}

		}
		return new int[] {rep,miss};
	}



	public static void main(String[] args) {
		int[][] grid1 = {{1, 3}, {2, 2}};
		System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid1)));
	}
}
