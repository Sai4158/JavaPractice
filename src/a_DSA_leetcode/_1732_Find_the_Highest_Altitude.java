package a_DSA_leetcode;

public class _1732_Find_the_Highest_Altitude {
	
    public static int largestAltitude(int[] gain) {
        
    	int n = gain.length;
    	int ans =  Integer.MIN_VALUE;
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
			count += gain[i];
		
			ans = Math.max(ans, count);
    	}    
    	
    	return Math.max(ans, 0);
    }
	
	public static void main(String[] args) {
	
		int []gain = {-5,1,5,0,-7};
		
		System.out.println(largestAltitude(gain));
	
	}
}
