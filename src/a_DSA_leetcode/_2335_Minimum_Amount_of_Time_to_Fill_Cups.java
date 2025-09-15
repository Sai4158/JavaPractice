package a_DSA_leetcode;

import java.util.Arrays;

public class _2335_Minimum_Amount_of_Time_to_Fill_Cups {

    public static int fillCups(int[] amount) {
        
    	Arrays.sort(amount);
    	
    	int sum =  amount[0] + amount[1] + amount[2];
    	
    	
    	return Math.max((sum+1)/2, amount[2]);
    	
    	
    }
    
    public static void main(String[] args) {
		
    	int amount[] = {1,4,2};
    	System.out.println(fillCups(amount));
	}
	
}
