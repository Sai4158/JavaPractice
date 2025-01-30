package a_DSA_leetcode;

public class _2413_Smallest_Even_Multiple {
	
    public static int smallestEvenMultiple(int n) {
        
    	int a = n * 2;
    	
    	if(n % 2 == 0) {
    		return n;
    	}
    		
    	
    	return a;
    }
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(smallestEvenMultiple(n));
	}
}
