package a_DSA_leetcode;

import java.util.Arrays;

public class _3264_Final_Array_State_After_K_Multiplication_Operations_I {
	public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minIndex = 0;

            for (int j = 1; j < nums.length; j++) {
            	
                if (nums[j] < nums[minIndex]) {
                    minIndex = j; 
                }
            }

            nums[minIndex] *= multiplier;
        }

        return nums; 
    }
    
    
    
    
    
//    Main method
    public static void main(String[] args) {
		
    	int nums[] = {2,1,3,5,6};
    	int k = 5;
    	int multipler = 2;
    	
    	System.out.println(getFinalState(nums, k, multipler));
	}
}
