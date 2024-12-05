package a_DSA_leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _387_First_Unique_Character_in_a_String_ {
	
	public static int firstUniqChar(String s) {
        
		 int n  = s.length();
		 
		 HashMap<Character, Integer> hm =  new HashMap<Character, Integer>();
		 
		 for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
				 hm.put(ch, hm.getOrDefault(ch,0)+1);
		}
		 
		 for (int i = 0; i < n; i++) {
	            if (hm.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		 return -1;
	    }
	
	
	public static void main(String[] args) {
		
		String s = "VDERGCCB";
		System.out.println(firstUniqChar(s));
	}
}
