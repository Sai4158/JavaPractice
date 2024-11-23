package a_DSA_leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class _561_Array_Partition {
	public static int arrayPairSum(int[] nums) {
		
		
		Arrays.sort(nums);
		
		int min = 0;
		
		for (int i = 0; i < nums.length; i+=2) {
			
			min += Math.min(nums[i], nums[i+1]);
			}
		
		return min;
		
	}

	
//	Main
	
	public static void main(String[] args) {
		
		int arr[] = {6,2,6,5,1,2};
		
		System.out.println(arrayPairSum(arr));
	}
}
