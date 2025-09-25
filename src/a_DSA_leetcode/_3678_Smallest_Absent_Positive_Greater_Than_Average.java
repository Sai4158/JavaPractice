package a_DSA_leetcode;

import java.util.HashSet;

public class _3678_Smallest_Absent_Positive_Greater_Than_Average {

    public static int smallestAbsent(int[] nums) {
        
    	int n =  nums.length;
    	int sum = 0;
    	HashSet<Integer> hs =  new 	HashSet<Integer>();

    	
    	for (int i = 0; i < n; i++) {
			
    		sum += nums[i];
    		hs.add(nums[i]);
		}
    	
    	double avg = (double) sum/n;
    	
    	
    	int candidate = (int) Math.floor(avg) + 1;
    	if(candidate < 1) candidate = 1;
    	
    	while(hs.contains(candidate)) {
    		candidate++;
    	}
    	
    	
    	return candidate;
    	
    }
	
	public static void main(String[] args) {
		
	}
}
