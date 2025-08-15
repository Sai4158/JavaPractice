package a_DSA_leetcode;

import java.util.HashSet;

public class _2154_Keep_Multiplying_Found_Values_by_Two {
	
	
    public static int findFinalValue(int[] nums, int original) {
        
    	int n =  nums.length;
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	for (int i = 0; i < n; i++) {
			hs.add(nums[i]);
		}
    	
    	while(hs.contains(original)) {
    		
    		original *= 2;
    		
    	}
    	
    	return original;
    }
	
	public static void main(String[] args) {
		int nums[] = {5,3,6,1,12}, original = 3;
		System.out.println(findFinalValue(nums, original));
	}
}
