package a_DSA_leetcode;

import java.util.Collection;
import java.util.Collections;

public class _2108_Find_First_Palindromic_String_in_the_Array {

	 public static String firstPalindrome(String[] words) {
	        
		 	String reverse =  "";
		 	String re  = "";
		 	
		 	for (int i = 0; i < words.length; i++) {
				reverse = "";
				
				for (int j = words[i].length() - 1; j >= 0; j--) {
	                reverse += words[i].charAt(j);
	            }
				
				if (words[i].equals(reverse)) {
	                re = words[i];
	                break; 
	            }
			}
		 	return re;
	    }
	 
//	 Main method 
	 public static void main(String[] args) {
		
		 String[] words = {"abc","car","ada","racecar","cool"};
		 
		 System.out.println(firstPalindrome(words));
	}
}
