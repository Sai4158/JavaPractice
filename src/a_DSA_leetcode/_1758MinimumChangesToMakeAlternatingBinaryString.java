package a_DSA_leetcode;

public class _1758MinimumChangesToMakeAlternatingBinaryString {

    public static int minOperations(String s) {
        
    	int count1 = 0;
    	int count2 = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		char expected1 = (i % 2 == 0) ? '0' : '1';
    		char expected2 = (i % 2 == 0) ? '1' : '0';
    		
    		
    		if(s.charAt(i) != expected1) {
    			count1++;
    		}
    		
    		if(s.charAt(i) != expected2) {
    			count2++;
    		}
    		
		}
    	
    	return Math.min(count1, count2);
    	
    }
    
    public static void main(String[] args) {
		String  s = "0100";
		System.out.println(minOperations(s));
	}
	
}
