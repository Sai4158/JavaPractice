package a_DSA_leetcode;

import java.util.HashMap;

public class _287_Find_the_Duplicate_Number {
	
	
    public static int findDuplicate(int[] nums) {
        
    	HashMap<Integer, Integer> h1 =  new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		int a  = nums[i];
            h1.put(a, h1.getOrDefault(a, 0) + 1);
		}
    	
    	
    	for (int i = 0; i < nums.length; i++) {
			if(h1.get(nums[i]) >  1) {
				return nums[i];
			}
		}
    	
    	return -1;
    	
    }
	
//	Main Method
	public static void main(String[] args) {
		
		int nums[] = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
}
