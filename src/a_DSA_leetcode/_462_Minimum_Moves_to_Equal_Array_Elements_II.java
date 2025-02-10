package a_DSA_leetcode;

import java.util.Arrays;

public class _462_Minimum_Moves_to_Equal_Array_Elements_II {
	
    public static int minMoves2(int[] nums) {
    
    	int n =  nums.length;
    	Arrays.sort(nums);
    	int count = 0;
    	
    	int median  =  nums[n/2];
    	
//    	1, 2, 3, n/2 = 2
    			
    			
//    			count += 1-2 = -1, 0, 3-2, 1, 1+0+1 = 2
    	for (int i = 0; i < n; i++) {
			
    		count+= Math.abs(nums[i]-median);
		}
    	
    	return count;
    	
    }
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(minMoves2(arr));
	}
	
	
}
