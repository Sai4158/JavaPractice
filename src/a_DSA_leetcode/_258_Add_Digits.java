package a_DSA_leetcode;

public class _258_Add_Digits {	       
		   
		   public static int addDigits(int num) {
		        while (num >= 10) {
		            int sum = 0;

		            for (; num > 0; num = num / 10) {
		                sum = sum + (num % 10); 
		            }

		            num = sum; 
		        }

		        return num; 
		    }
	  
	   
	   public static void main(String[] args) {
		int num = 35;
		System.out.println(addDigits(num));
	}
}
