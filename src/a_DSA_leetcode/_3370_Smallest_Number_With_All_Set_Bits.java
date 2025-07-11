package a_DSA_leetcode;

public class _3370_Smallest_Number_With_All_Set_Bits {
	
    public static int smallestNumber(int n) {
        
    	int power = 1;
    	
    	while(true) {
    		
    		int candidate = (int)Math.pow(2, power)-1;
    		
    		if(candidate >= n) {
    			return candidate;
    		}
    		
    		power++;
    	}
    	
    }
	
	public static void main(String[] args) {
		System.out.println(smallestNumber(5));
	}
}
