package a_DSA_leetcode;

public class _233_Number_of_Digit_One {
	
    public static int countDigitOne(int n) {
        
    	int count = 0;

    	
    	for (int i = 0; i <= n; i++) {
			
    		int currentNum = i;
    		
    		while(currentNum > 0 ) {
    			if(currentNum % 10 == 1) {
    				count++;
    			}
    			currentNum /= 10;
    		}
		}
    	return count;
    	
    }
	
	public static void main(String[] args) {
		int n = 13;
		System.out.println(countDigitOne(n));
	}
}
