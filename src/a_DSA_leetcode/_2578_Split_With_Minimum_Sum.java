package a_DSA_leetcode;

import java.util.Arrays;

public class _2578_Split_With_Minimum_Sum {
	
    public static int splitNum(int num) {
        
    	char[] digits = String.valueOf(num).toCharArray();
    	
    	Arrays.sort(digits);
    	
    	int num1 = 0;
    	int num2 = 0;
    	
    	
    	for (int i = 0; i < digits.length; i++) {
			
    		int d =  digits[i] - '0';
    		
    		if(i % 2 == 0) {
    			num1 =  num1 * 10 + d;
    		}
    		else{
    			num2 =  num2 * 10 + d;

    		}
		}
    	
    	return num1 + num2;
    	
    	
    }
	
	public static void main(String[] args) {
		
		int num = 4325;
		System.out.println(splitNum(num));
		
	}
}
