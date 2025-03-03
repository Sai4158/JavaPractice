package a_DSA_leetcode;

import java.util.Arrays;

public class _2160_Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {
	
    public static int minimumSum(int num) {
        
    	 int[] digits = new int[4];
         for (int i = 0; i < 4; i++) {
             digits[i] = num % 10;
             num /= 10;
         }

         Arrays.sort(digits);

         int num1 = digits[0] * 10 + digits[2];
         int num2 = digits[1] * 10 + digits[3];

         return num1 + num2;
     }

	
	public static void main(String[] args) {
		System.out.println(minimumSum(2932));
	}
}
