package a_DSA_leetcode;

public class _2652_Sum_Multiples {
	
	 public static int sumOfMultiples(int n) {
	        
	        int count = 0;

	        for (int i = 1; i <= n; i++) {

	        if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
	            count = count + i;
	        }
	            }

	        return count;
	    }
	
	public static void main(String[] args) {
		
	int k = 5;
	
	System.out.println(sumOfMultiples(k));
		
	}
}
