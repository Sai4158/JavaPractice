package a_DSA_leetcode;

import java.util.Arrays;

public class _66_Plus_One_{
	 public static int[] plusOne(int[] digits) {
	        

	        int n = digits.length-1;

	        for (int i = n; i >= 0; i--) {
	            if(digits[i] <9){
	                digits[i]++;
	                return digits;
	            } 
	            digits[i]=0;  
	        }
	       digits = new int[digits.length + 1];
			digits[0] = 1;
			return digits;
			
	    }
	 
	 public static void main(String[] args) {
		 int arr[] = {1,2,3,4};
	     int[] result = plusOne(arr);
	     
	    System.out.println(Arrays.toString(result));
	
	}
}	
