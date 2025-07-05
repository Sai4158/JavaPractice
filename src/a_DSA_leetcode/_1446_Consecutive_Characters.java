package a_DSA_leetcode;

public class _1446_Consecutive_Characters {
	
    public static int maxPower(String s) {
        
        int max = 1;
        int count = 1;
    	int n = s.length();
    	
//    	Start a forloop till the s.lenght
    	for (int i = 1; i < n; i++) {
			
    		//if 0 or 1 index char matches then count++;
    		if(s.charAt(i) == s.charAt(i-1)) {
    			count++;
    			max =  Math.max(count, max);
    			
    			
//    			Otherwise make it 0
    		}else {
    			count = 1;
    		}
    		
		}
    	
//    	Return the max amount of count found it
    	return max;
    }
	
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(maxPower(s));
	}
}
