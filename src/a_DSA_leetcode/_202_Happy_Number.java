package a_DSA_leetcode;

public class _202_Happy_Number {
	
    public static boolean isHappy(int n) {
        
    	
    	int a = 0;
    	int b = 0;
    	
    	while(n != 1 && n != 4) {
    		
    		a =0;
    		b =n;
    		
    		while(b>0) {
    			int digits =  b  %10;
    			 a +=digits * digits;
    			 b /=10;
    			 
    		}
    		n =a;
    	}
    	return n==1;
    	
    }
    
    public static void main(String[] args) {
		
    	int n = 19;
    	System.out.println(isHappy(n));
	}
}
