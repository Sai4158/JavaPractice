package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class _1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
	
    public static int maxVowels(String s, int k) {
    	
    	int n = s.length();
    	int l = 0;
    	int temp = 0;
    	int count = 0;
    	
    	ArrayList<Character> vowels =  new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    	
    	for (int r = 0; r < n; r++) {
			
    		
    		if(vowels.contains(s.charAt(r))) {
    			temp++;
    		}
    		
    		if (r - l + 1 > k) { 
    			if (vowels.contains(s.charAt(l))) {
        			temp--;
        		}
    			l++;
    		}
    		
    		count = Math.max(count, temp);
    		
		}
    	return count;
    
      }
	
	public static void main(String[] args) {
		
		String s = "abciiidef";
		int k = 3;
		
		System.out.println(maxVowels(s, k));
		
	}
}
