package a_DSA_leetcode;

import java.util.Iterator;

public class _334_Increasing_Triplet_Subsequence {

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE; 
        int second = Integer.MAX_VALUE; 
        int third = Integer.MAX_VALUE; 

        for (int num : nums) {
            if (num <= first) {
                first = num; 
            } else if (num <= second) {
                second = num; 
            } else if (num <= third) {
                return true;
            }
        }

        return false; 
    }


	public static void main(String[] args) {
		int[] nums = {2, 1, 5, 0, 4, 6};
		System.out.println(increasingTriplet(nums));
	}
}
