package a_DSA_leetcode;

import java.util.HashSet;

public class _2540_Minimum_Common_Value {
	
    public static int getCommon(int[] nums1, int[] nums2) {
        
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	for(int num1 :  nums1) {
    		hs.add(num1);
    	}
    	
    	for(int num2 : nums2) {
    		
    		if(hs.contains(num2)) {
    			return num2;
    		}
    	}
    	
    	
    	return -1;
    }
	
	public static void main(String[] args) {
		int nums1[] = {1,2,3}, nums2[] = {2,4};
		System.out.println(getCommon(nums1, nums2));
	}
}
