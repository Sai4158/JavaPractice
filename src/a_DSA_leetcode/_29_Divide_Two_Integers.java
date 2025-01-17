package a_DSA_leetcode;

public class _29_Divide_Two_Integers {
	
    public static int divide(int dividend, int divisor) {
        
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
        	return Integer.MAX_VALUE;
        }
        

        return dividend / divisor;
    }
	
	public static void main(String[] args) {
		
		int dividend = 10, divisor = 3;
		
		System.out.println(divide(dividend, divisor));
	}
}
