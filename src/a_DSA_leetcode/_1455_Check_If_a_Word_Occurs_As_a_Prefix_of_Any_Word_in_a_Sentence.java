package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1455_Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
	
    public static int isPrefixOfWord(String sentence, String searchWord) {
        
    	
    	int n =  searchWord.length();
    	
//    	split the words by space
    	String[] words  =  sentence.trim().split(" ");
    	
//    	Array list to store each words
    	ArrayList<String> al = new ArrayList<String>();
    	
//    	Add the words to the arrayList
    	for (int i = 0; i < words.length; i++) {
    		al.add(words[i]);
		}
    	
//    	in the ArrayList, search the word using startsWith and if so return index + 1
    	for (int i = 0; i < al.size(); i++) {
    		if(al.get(i).startsWith(searchWord)) {
    			return i + 1;
    		}
		}
    	
//    	if not return -1
    	return -1;
    }
	
	public static void main(String[] args) {
		String sentence = "i love eating burger", searchWord = "burg";
		System.out.println(isPrefixOfWord(sentence, searchWord));
	}
}
