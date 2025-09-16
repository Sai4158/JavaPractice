package a_DSA_leetcode;

import java.util.Arrays;

public class _2335_Minimum_Amount_of_Time_to_Fill_Cups {


    public static int fillCups(int[] amount) {
        
//    	Sort all the amount in the array
    	Arrays.sort(amount);
    	
    	
//    	Add all the 3 nums in the array to find the sum
    	int sum =  amount[0] + amount[1] + amount[2];
    	
    	
//    	Once you find the sum, return which is max
    	return Math.max((sum+1)/2, amount[2]);
    	
    	
    }
    
//    Main method
    public static void main(String[] args) {
		
    	int amount[] = {1,4,2};
    	System.out.println(fillCups(amount));
	}
	
}
