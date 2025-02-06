package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashSet;

import javax.swing.text.html.MinimalHTMLWriter;

public class _2357_Make_Array_Zero_by_Subtracting_Equal_Amounts {

    public static int minimumOperations(int[] nums) {
         
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	int count = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
			    		
    		if(nums[i] != 0) {
    			hs.add(nums[i]);
    		}
    		    		
		}
    	
    	count = hs.size();
    	
    	return count;
    
    }
	
	public static void main(String[] args) {
		int nums[] = {1,5,0,3,5};
		System.out.println(minimumOperations(nums));
	}
}
