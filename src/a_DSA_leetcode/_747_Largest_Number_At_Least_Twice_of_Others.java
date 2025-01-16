package a_DSA_leetcode;

import java.util.Arrays;

public class _747_Largest_Number_At_Least_Twice_of_Others {
	
    public static int dominantIndex(int[] nums) {
        int n = nums.length;

        int largest = -1;
        int secondLargest = -1;
        int largestIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                largestIndex = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        if (largest >= 2 * secondLargest) {
            return largestIndex;
        }

        return -1;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {3,6,1,0};
		
		System.out.println(dominantIndex(nums));
	}
}
