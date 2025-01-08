package a_DSA_leetcode;

import java.util.ArrayList;


public class _2828_Check_if_a_String_Is_an_Acronym_of_Words {
	
	public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()){
            return false;
        }

        for(int i =0; i<words.size(); i++){
            char a = words.get(i).charAt(0);
            char b =  s.charAt(i);
            
            if(a!=b){
                return false;
            }
            
        }
        return true;
    }

	
	public static void main(String[] args) {
		
		 List<String> words1 = List.of("alice", "bob", "charlie");
	        String s1 = "abc";
	        System.out.println(isAcronym(words1, s1));
	}
}
