package a_DSA_leetcode;

import java.util.HashMap;

public class _383_Ransom_Note_1 {
    
	
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // count letters in magazine
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // use letters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
    
    public static void main(String[] args) {
		
    	String ransomNote = "a", magazine = "b";
    	System.out.println(canConstruct(ransomNote, magazine));
    	
	}
}
