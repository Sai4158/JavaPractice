package a_DSA_leetcode;

public class _202_Happy_Number1 {

    public static boolean isHappy(int n) {

        // happy numbers are only for positive integers
        if (n <= 0) {
            return false;
        }

        // we repeat the process many times
        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            // if we ever reach 1, it's happy
            if (n == 1) {
                return true;
            }

            // if we ever reach 4, it will loop forever -> not happy
            if (n == 4) {
                return false;
            }

            // ans will store sum of squares of digits
            int ans = 0;

            // convert number to string so we can read digits easily
            String s = Integer.toString(n);

            // go through each digit in the string
            for (int j = 0; j < s.length(); j++) {

                // convert character digit to integer digit
                int digit = s.charAt(j) - '0';

                // add square of digit to ans
                ans += digit * digit;
            }

            // update n to the new number (sum of squares)
            n = ans;
        }

        // if somehow not found 1 and not hit 4 within 1000 steps
        return false;
    }
    
    public static boolean isHappy1(int n) {
        
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
