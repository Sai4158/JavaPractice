package a_DSA_leetcode;

import java.util.HashSet;

public class _2442_Count_Number_of_Distinct_Integers_After_Reverse_Operations {

    public static int countDistinctIntegers(int[] nums) {
        
    	int n =  nums.length;
    	HashSet<Integer> ans =  new HashSet<Integer>();
    	
    	for (int i = 0; i < n; i++) {
			
    		
    		ans.add(nums[i]);
    		
        	StringBuilder rev = new StringBuilder();
    		rev.append(String.valueOf(nums[i]));
    		rev.reverse();
    		
    		
//    		automatically ignores leading zeros when parsing strings into integers
            int add = Integer.parseInt(rev.toString());
    		
    		ans.add(add);
    		
		}
    	
    	return ans.size();
    }
	
	public static void main(String[] args) {
		int nums[] = {1,13,10,12,31};
		System.out.println(countDistinctIntegers(nums));
	}
}
