package a_DSA_leetcode;

import java.util.Arrays;

public class _344_Reverse_String {
    public static void reverseString(char[] s) {
           	
    	int n = s.length;
    	
    	for (int i = 0; i < n/2; i++) {			
    		  char temp = s[i];
    		  			
              s[i] = s[n - 1 - i];
              s[n - 1 - i] = temp;
		}
    	
    }
    
    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o'};
        
        reverseString(s);
        System.out.println(Arrays.toString(s)); 
    }
   
}
