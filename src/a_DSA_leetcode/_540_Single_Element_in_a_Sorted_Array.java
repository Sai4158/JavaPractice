package a_DSA_leetcode;

import java.util.HashMap;

public class _540_Single_Element_in_a_Sorted_Array {
	
    public static int singleNonDuplicate(int[] nums) {
        
    	int n  = nums.length;
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < n; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
    	
    	for(Integer i : hm.keySet()) {
    		if(hm.get(i) == 1) {
    			return i;
    		}
    	}
    	return -1;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums1));
	}
}
