package a_DSA_leetcode;

public class _Count_Commas_in_Range_II {

    public static long countCommas(long n) {
        
    	long ans = 0;
    	long store = n;
    	
    	for (long i = 1000; i < store; i*=1000) {
			
    		
    		ans +=(store - i + 1);
    		
    		if(i > store /1000) {
    			break;
    		}
    		
		}
    	
        return ans;

    	
    }
    
    
    public static void main(String[] args) {
		
    	long n = 1002;
    	System.out.println(countCommas(n));
    	
	}
	
}
