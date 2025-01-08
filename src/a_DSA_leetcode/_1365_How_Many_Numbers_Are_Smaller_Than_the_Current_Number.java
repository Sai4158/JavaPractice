package a_DSA_leetcode;

import java.util.ArrayList;

public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
	
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        
    	int n = nums.length;
    	ArrayList<Integer> list  =  new ArrayList<Integer>();
    	
    	
    	for (int i = 0; i < n; i++) {
			int count = 0;
			
    		for (int j = 0; j < nums.length; j++) {
    			if (nums[j] < nums[i]) {
                    count++;
                }
			}
    		
			list.add(count);

    	}

    	
//    	Converting array list to int list
    		int[] result = new int[n];
    		
            for (int i = 0; i < n; i++) {
                result[i] = list.get(i);
            }

            return result;
    	
    }
    
    public static void main(String[] args) {
    	int nums[] = {8,1,2,2,3};
    	System.out.println(smallerNumbersThanCurrent(nums));
	}
}
