package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class _443_String_Compression {
	
	   public static int compress(char[] chars) {
	        
	        HashMap<Character, Integer> hm = new HashMap<>();
	        ArrayList<String> al = new ArrayList<>();
	        
	        int n = chars.length;
	        int count = 1;
	        
	        for (int i = 1; i < n; i++) {
	            if (chars[i] == chars[i - 1]) {
	                count++; 
	            } else {
	                al.add(String.valueOf(chars[i - 1]));
	                if (count > 1) {
	                    for (char ch : String.valueOf(count).toCharArray()) {
	                        al.add(String.valueOf(ch));
	                    }
	                }
	                count = 1;
	            }
	        }

	        al.add(String.valueOf(chars[n - 1]));
	        if (count > 1) {
	            for (char ch : String.valueOf(count).toCharArray()) {
	                al.add(String.valueOf(ch));
	            }
	        }

	        for (int i = 0; i < al.size(); i++) {
	            chars[i] = al.get(i).charAt(0);
	        }

	        return al.size();
	    }
	
	public static void main(String[] args) {
		char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars1)); 
	}
}
