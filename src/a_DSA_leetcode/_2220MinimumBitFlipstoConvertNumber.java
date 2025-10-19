package a_DSA_leetcode;

public class _2220MinimumBitFlipstoConvertNumber {

    public static int minBitFlips(int start, int goal) {
        
    	return Integer.bitCount(start ^ goal);
    	
    }
    
    
	
	public static void main(String[] args) {
		
		int start = 10, goal = 7;
		System.out.println(minBitFlips(start, goal));
		
	}
}
