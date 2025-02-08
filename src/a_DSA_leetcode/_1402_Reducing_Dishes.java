package a_DSA_leetcode;

import java.util.Arrays;

public class _1402_Reducing_Dishes {
	
    public static int maxSatisfaction(int[] satisfaction) {
        
    	int n = satisfaction.length;
    	int ans = 0;
    	int sum = 0;
    	
    	Arrays.sort(satisfaction);
    	
    	for (int i = n-1; i >=0; i--) {
		
    		sum += satisfaction[i];
    		
    		if(sum + ans > ans ) {
    			ans += sum;	
    		}else {
    			break;

    		}
    			
		}
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		int satisfaction[] = {-1,-8,0,5,-9};
		System.out.println(maxSatisfaction(satisfaction));
	}
}
