package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _229_Majority_Element_II {
	
    public static List<Integer> majorityElement(int[] nums) {
        
    	int n = nums.length;
    	int max =  n/3;
    	
    	List<Integer> ans = new ArrayList<Integer>();
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	
    	for (int i = 0; i < n; i++) {
			
    		int val =  nums[i];
    		
    		hm.put(val, hm.getOrDefault(val, 0)+1);
		}
    	
    	
    	for(int a : hm.keySet()) {
    		 
    		if(hm.get(a) > max) {
    			ans.add(a); 
    		}
    	}
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
	}
}
