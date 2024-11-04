package a_DSA_leetcode;

import java.util.ArrayList;

public class _500_Keyboard_Row {
    public static String[] findWords(String[] words) {
        String word1 = "qwertyuiop";
        String word2 = "asdfghjkl";
        String word3 = "zxcvbnm";
        
        ArrayList<String> list = new ArrayList<>();
        
        for (String word : words) {
            int r1 = 0, r2 = 0, r3 = 0;
            String s = word.toLowerCase();

            // Count characters that belong to each row
            for (int i = 0; i < s.length(); i++) {
                if (word1.contains(Character.toString(s.charAt(i)))) {
                    r1++;
                } else if (word2.contains(Character.toString(s.charAt(i)))) {
                    r2++;
                } else if (word3.contains(Character.toString(s.charAt(i)))) {
                    r3++;
                }
            }

            // Check if the entire word fits one row
            if (r1 == s.length() || r2 == s.length() || r3 == s.length()) {
                list.add(word);
            }
        }
        
        // Convert the list to an array
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }

	 
//	 Main  Method
	 public static void main(String[] args) {
		 String[] words = {"Hello", "Alaska", "Dad", "Peace"};
	        String[] result = findWords(words);
	        for (String word : result) {
	            System.out.println(word);
	}
}
}
