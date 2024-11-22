package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class _151_Reverse_Words_in_a_String {
	  public static String reverseWords(String s) {
	        
        s = s.trim();
        
        String words[] = s.split("\\s+");
        
        
        ArrayList<String> wordList =  new ArrayList<String>();
        
        Collections.addAll(wordList, words);
        Collections.reverse(wordList);
        
        
        return String.join(" ", wordList);
	  }
	  
	  public static void main(String[] args) {
		  System.out.println(reverseWords("    egg cow"));
		
	}
	 
}
