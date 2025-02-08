package a_DSA_part_41_to_part_50;

import java.util.Arrays;

public class Day42Reducing_Dishes {
	
    public static int maxSatisfaction(int[] satisfaction) {
    
    	int n = satisfaction.length;
    	Arrays.sort(satisfaction);
    
    	int total = 0;
    	int sum = 0;
    	
    	
    	for (int i = n-1; i >= 0; i--) {
    		sum += satisfaction[i];
    		 
    		 if(sum + total > total) {
    			 total += sum;

    		 }else {
    			 break;
    		 }
		}
    	
    	return total;
    }
	
	
	public static void main(String[] args) {
		
		int satisfaction[] = {4,3,2};
		
		System.out.println(maxSatisfaction(satisfaction));
	}
}
