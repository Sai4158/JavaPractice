package a_DSA_leetcode;

public class _1446_Consecutive_Characters {
	
    public static int maxPower(String s) {
        
        int max = 1;
        int count = 1;
    	int n = s.length();
    	
    	for (int i = 1; i < n; i++) {
			
    		if(s.charAt(i) == s.charAt(i-1)) {
    			count++;
    			max =  Math.max(count, max);
    			
    		}else {
    			count = 1;
    		}
    		
		}
    	return max;
    }
	
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(maxPower(s));
	}
}
