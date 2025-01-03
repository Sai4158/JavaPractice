package a_DSA_leetcode;

import java.util.Arrays;
import java.util.Collections;

public class _58_Length_of_Last_Word_ {
	
	
    public static int lengthOfLastWord(String s) {
        
//    	Removes all the extra spaces 
    	 String b = s.trim();
    	     	 
         int count = 0;
         int n = b.length();
    
    		
         for (int i = n - 1; i >= 0; i--) {
    		    		
    		if(b.charAt(i) == ' ') {
    			break;
			}else {
				count++;
			}
    		
		}
    	
    	return count;
    	
    }
	
	
//	Main Method
	public static void main(String[] args) {
		String s  = "   fly me   to   the moon  ";
		
		System.out.println(lengthOfLastWord(s));
	}
}
