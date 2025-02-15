package a_DSA_leetcode;

public class _1011_Capacity_To_Ship_Packages_Within_D_Days {
    public static int shipWithinDays(int[] weights, int days) {
        
    	int n =  weights.length;
    	int l = 1;
    	int r =  Integer.MAX_VALUE;
    	
    	while(l<=r) {
    		
    		int mid = l +(r-l)/2;
    		
    		if(isPossible(weights, days, mid)) {
    			r = mid - 1;
    		}else { 
    			l = mid +1;
    		}
    		
    	}
    	
    	return l;
    }
    
        public static boolean isPossible(int[] weights, int days, int k) {
        
        	int temp = 0;
        	
        	for (int i = 0; i < weights.length; i++) {
				
        		if(weights[i]>k) {
        			return false;
        		}
        		
        		if(weights[i] + temp > k) {
        			days-=1;
        			temp =0;
        		}
        		
        		temp+= weights[i];
        		
        		if(days ==0) {
        			return false;
        		}
			}
        	return true;
        	
        }
        
    
    public static void main(String[] args) {
		
    	int weights[] = {1,2,3,4,5,6,7,8,9,10}, days = 5;
    	System.out.println(shipWithinDays(weights, days));
	}
}
