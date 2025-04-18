package a_DSA_leetcode;

public class _1550_Three_Consecutive_Odds {
	
    public static boolean threeConsecutiveOdds(int[] arr) {
        
    	int n = arr.length;
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		if(arr[i] % 2 == 1) {
    			count++;
    			if(count >= 3) {
    				return true;
    			}
    		}else {
    			count = 0;
    		}
    		
		}
    	
    	return false;
    	
    }
    
    public static void main(String[] args) {
	
    	int arr[] = {1,2,34,3,4,5,7,23,12};
    	
    	System.out.println(threeConsecutiveOdds(arr));
	}
}
