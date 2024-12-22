package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _2942_Find_Words_Containing_Character {

	
    public static List<Integer> findWordsContaining(String[] words, char x) {
        
    	int n  =  words.length;
        List<Integer> result = new ArrayList<>();

    	
    	for (int i = 0; i < n; i++) {
    		String word = words[i];
    		
    		for (int j = 0; j < word.length(); j++) {
    			if(word.charAt(j) ==  x) {
    				result.add(i);
                     break;
    			}
			}
		}
    	
    	return result;
    	
    }
	
	
//	Main Method
	public static void main(String[] args) {
		
        String words[] = {"leet", "code"};
        char x = 'e';

        System.out.println(findWordsContaining(words, x));
	}
}
