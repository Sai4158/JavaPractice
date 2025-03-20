package a_DSA_leetcode;

import java.util.HashMap;

public class _961_N_Repeated_Element_in_Size_2N_Array {

    public static int repeatedNTimes(int[] nums) {
        
    	HashMap<Integer, Integer>hm =  new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    		
    		
    		if(hm.get(nums[i])>1) {
    			return nums[i];
    		}
		}
    	
    	return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1, 2, 3, 3}));
    }
}
