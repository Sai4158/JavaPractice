package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashSet;

import arrayList_Vector_P46.Arraylist;
public class _804_Unique_Morse_Code_Words {
	
    public static int uniqueMorseRepresentations(String[] words) {


    	String[] morseArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.." };
    	
    	HashSet<String> ans = new HashSet<>();
    	
   
    	for(String word : words) {
    		
    		StringBuilder sb = new StringBuilder();
    		
    		for(char add : word.toCharArray()) {
    			
//    			Will the morseArray index and then we will add it
    			int index =  add - 'a';
    			sb.append(morseArray[index]);
    			
			}
    		
    		ans.add(sb.toString());
    	}
        return ans.size();
    }
	
	public static void main(String[] args) {
		String word[] = {"gin","zen","gig","msg"};
		System.out.println(uniqueMorseRepresentations(word));
	}
}
