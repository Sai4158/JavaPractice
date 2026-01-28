package a_DSA_leetcode;

public class _202_Happy_Number1 {

    public static boolean isHappy(int n) {
        
    	if(n < 0) {
    		return false;
    	}
    	
    	
    	    	
    	for (int i = 0; i <1000; i++) {
			
    		if(n == 1) {
    			return true;
    		}
    		
    		if(n ==  4) {
    			return false;
    		}
    		
    		int ans = 0;
        	String s =  Integer.toString(n);

    		
    		 for (int j = 0; j < s.length(); j++) {
				
    			 int digit =  s.charAt(j) - '0';
    			
    			 ans += digit*digit;
    			 
			}
    		
    		 
    		 n = ans;
    		 
		}
    	
    	
    	return false;
    	
    }
    
    public static void main(String[] args) {
		
    	int n = 19;
    	System.out.println(isHappy(n));
    	
	}
	
}
