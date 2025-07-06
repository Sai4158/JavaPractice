package a_DSA_leetcode;

import java.util.HashMap;

public class _1446_Consecutive_Characters_1 {
	
	
    public static int maxPower(String s) {
    
    	int n = s.length();
    	HashMap<Character, Integer> hm = new HashMap<>();
    	
    	for (int i = 0; i < n; i++) {
			
    		hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
    		
		}
    	
    	int count = 0;
    	int max = 0;
    	
    	for(char c : hm.keySet()) {
    		
    		if(count > max) {
    			max =  count;
    		}else {
    			count = 0;
    		}
    		
    		count =  hm.get(c);
    		
    	}
    
    	return max;
    }
	
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(maxPower(s));
	}
}
