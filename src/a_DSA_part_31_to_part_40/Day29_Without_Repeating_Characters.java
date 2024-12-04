package a_DSA_part_31_to_part_40;

import java.util.HashSet;

public class Day29_Without_Repeating_Characters {
	public static void main(String[] args) {
		
		HashSet<Character> s1 = new HashSet<Character>();
		
		String s =  "abcabcbb";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			s1.add(ch);
		}
		
		System.out.println(s1.size());
	}
}
