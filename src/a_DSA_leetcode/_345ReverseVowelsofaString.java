package a_DSA_leetcode;

import java.lang.invoke.VolatileCallSite;

public class _345ReverseVowelsofaString {

    public static String reverseVowels(String s) {
        
    	int n =  s.length();
    	
    	int  l = 0;
    	int  r = n - 1;
    	
    	char c[] = s.toCharArray();
    	
    	while(l<r) {
    		
    		if(!isVowel(c[l])) {
    			l++;
    		}
    		
    		else  if (!isVowel(c[r])) {
    			r--;
    		}
    		
    		else {
    			
    			char temp = c[l];
    			
    			c[l] =  c[r];
    			c[r] = temp;
    			
    			l++;
    			
    			r--;
    			
    		}
    	}
    	
    	return new String(c);
    }
    
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    

	public static void main(String[] args) {
		
	}
}
