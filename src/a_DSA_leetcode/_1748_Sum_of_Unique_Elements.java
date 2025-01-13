package a_DSA_leetcode;

import java.util.HashMap;

public class _1748_Sum_of_Unique_Elements {
	
	public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freqMap.get(nums[i]) == 1) {
                total += nums[i];
            }
        }

        return total;
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {1,2,3,2};
    	System.out.println(sumOfUnique(nums));
 	}
}
