package a_DSA_leetcode;

import java.util.HashMap;
import java.util.Set;

public class _191_Number_of_1_Bits {
	
    public static int hammingWeight(int n) {
        
    	HashMap<Character, Integer> hm = new HashMap<>();
    	
    	String a =  Integer.toBinaryString(n);
    	
    	
    	for (int i = 0; i < a.length(); i++) { 
			hm.put(a.charAt(i), hm.getOrDefault(a.charAt(i), 0) + 1);
		}
    	
    	 return hm.getOrDefault('1', 0);
    }
	
	public static void main(String[] args) {
		int n  = 11;
		System.out.println(hammingWeight(n));
	}
}
