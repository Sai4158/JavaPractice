package a_DSA_leetcode;

import java.util.Arrays;

public class _1051_Height_Checker {

    public static int heightChecker(int[] heights) {
        
    	int n = heights.length;
    	int[] sorted =  Arrays.copyOf(heights, n);
    	int count = 0;
    	Arrays.sort(sorted);
    		
 
    	for (int i = 0; i < n; i++) {
			
    		
    		if(sorted[i] != heights[i]) {
    			count ++;
    		}
		}
    	return count;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,1,4,2,1,3};
		System.out.println(heightChecker(nums));
		
	}
}
