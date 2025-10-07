package a_DSA_leetcode;

public class _326PowerofThree {

//	IsPowerOfThree method
    public static boolean isPowerOfThree(int n) {
        

        if (n <= 0) {
            return false;
        }
    	
    	for (int i = 0; i < 20; i++) {
			
    		
    		int power  =  (int) Math.pow(3, i);
    		
    		if( power == n) {
    			return true;
    		}
    		
    		if(power > n) {
    			break;
    		}
    		
		}
    	
    	return false;
    }
    
//    Main
    public static void main(String[] args) {
		int  n = 27;
		
		System.out.println(isPowerOfThree(n));
	}
}
