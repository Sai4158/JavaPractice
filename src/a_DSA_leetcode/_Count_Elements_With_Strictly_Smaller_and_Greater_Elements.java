package a_DSA_leetcode;

import java.util.Arrays;

public class _Count_Elements_With_Strictly_Smaller_and_Greater_Elements {

	public static int countElements(int[] nums) {
			
			int n = nums.length;
			
			Arrays.sort(nums);
			
			int count = 0;
			
			for (int i = 0; i <n; i++) {
				
				if(nums[i] > nums[0] && nums[i] < nums[n-1]) {
					count++;
				}
			}
			
			return count;
	}

	
	
//	Main method
	public static void main(String[] args) {
			int arr[] = {11,7,2,15};
			System.out.println(countElements(arr));
	}
}
