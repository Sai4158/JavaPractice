package a_DSA_part_31_to_part_40;

import java.util.HashSet;

public class Day25_LongestSubstring {

	public static void main(String[] args) {
		String s = "abcabcbb";
		int l = 0, ans = 0;
		HashSet<Character> set = new HashSet<>();

		for (int r = 0; r < s.length(); r++) {
			while (set.contains(s.charAt(r))) {
				set.remove(s.charAt(l));
				l++;
			}
			set.add(s.charAt(r));
			ans = Math.max(ans, r - l + 1);
		}

		System.out.println(ans); 
	}
}
