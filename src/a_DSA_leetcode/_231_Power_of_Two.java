package a_DSA_leetcode;

public class _231_Power_of_Two {
	
    public static boolean isPowerOfTwo(int n) {
        
    	int ans = n;
    	
    	
    	for (int i = 0; i < n; i++) {
			
    		int power = i;
    		
    		if (Math.pow(2, power) == ans) {
    			return true;
    		}
    		
		}
    	return false;
    }
	
	public static void main(String[] args) {
		
		int n = 16;
		int n1 = 3;
		
		
		System.out.println(isPowerOfTwo(n));
		System.out.println(isPowerOfTwo(n1));
	}
}
