package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _3300_Minimum_Element_After_Replacement_With_Digit_Sum {

	
    public static int minElement(int[] nums) {
        
    	int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

    	for (int i = 0; i < n; i++) {
			
    		String s =  Integer.toString(nums[i]);
    		int sum = 0;
    		
            for (char ch : s.toCharArray()) {
    			
            	sum += ch - '0';
    		}
            
            ans.add(sum);
    		
		}
    	Collections.sort(ans);
    	
    	return ans.get(0);
    }
	
	public static void main(String[] args) {
		int nums[] = {10,12,13,14};
		System.out.println(minElement(nums));
	}
}
