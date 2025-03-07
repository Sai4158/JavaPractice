package a_DSA_leetcode;

import java.util.concurrent.CountDownLatch;

public class _3184_Count_Pairs_That_Form_a_Complete_Day_I {

    public static int countCompleteDayPairs(int[] hours) {
        
    	int n =  hours.length;
    	int count = 0;
    	
    	for (int i = 0; i < hours.length; i++) {
			for (int j = i+1; j < hours.length; j++) {
				
				if((hours[i] +  hours[j]) % 24 == 0) {
					count++;
				}
				
			}
		}
    	return count;
    	
    }
    
    public static void main(String[] args) {
    	
    	int nums[] = {12,12,30,24,24};
    	
    	System.out.println(countCompleteDayPairs(nums));
	}
}
