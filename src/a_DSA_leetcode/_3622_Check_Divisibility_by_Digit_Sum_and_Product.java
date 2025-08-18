package a_DSA_leetcode;

public class _3622_Check_Divisibility_by_Digit_Sum_and_Product {

    public static boolean checkDivisibility(int n) {
        
    	int product  = 1;
    	int sum = 0;
    	String s =  Integer.toString(n);
    	
    	for(char c : s.toCharArray()) {
    		
    		int digit =  c - '0';	
    		
    		sum += digit;
    		product *= digit;
    		
    	}
    	
    	int total = sum +  product;
    	
    	return n % total == 0;
    	
    }
    
    
    public static void main(String[] args) {
    	 System.out.println(checkDivisibility(99));
	}
	
}
