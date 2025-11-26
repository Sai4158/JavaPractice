package a_DSA_leetcode;

import java.util.HashMap;

public class _80_Remove_Duplicates_from_Sorted_Array_II {

    public static int removeDuplicates(int[] nums) {
        
    	int n =  nums.length;
    	
    	if(n <= 2)return n;
    	
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < n; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);	
		}
    	
    	int count = 0;
    	
    	for(int c : hm.keySet()) {
    		    		
    		if(hm.get(c) > 2) {
    			count += 2;
    		}else {
    			count += hm.get(c);
    		}	
    	}
    	
    	
    	return count;
    }
    
    public static int removeDuplicates1(int[] nums) {
        
    	int n =  nums.length;
    	
    	if(n <= 2)return n;
    	
    	int first = 2;
    	
    	for (int i = 2; i < n; i++) {
			
    		if(nums[i] != nums[first-2]) {
    			nums[first]  = nums[i];
    			first++;
    			
    		}
    		
		}
    	return first;
    }
    
	
	public static void main(String[] args) {
		
		int nums[] = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates(nums));
		
		int nums1[] = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates1(nums1));
		
		
		int nums2[] = {0,0,1,1,1,1,0,0,1,1,1,1};
		System.out.println(removeDuplicates1(nums2));
	}
}
