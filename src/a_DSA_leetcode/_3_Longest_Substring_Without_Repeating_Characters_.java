package a_DSA_leetcode;

import java.util.HashSet;

public class _3_Longest_Substring_Without_Repeating_Characters_ {


	public static int lengthOfLongestSubstring(String s) {
		
		int n =  s.length();
		int  l = 0;
		int ans = 0;
		
		HashSet<Character> s1 =  new HashSet<Character>();
		
		
		for (int r = 0; r < n-1; r++) {
			
			char ch = s.charAt(r);
			
			if(!s1.contains(ch)) {
				s1.add(ch);
			}else {
				while(s1.contains(ch)) {
					
					s1.remove(s.charAt(l));
					
					l++;
				}
				s1.add(ch);
				
			}
			ans =  Math.max(r-l+1, ans);
		}
		
		return ans;

	}
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		
		System.out.println(lengthOfLongestSubstring(s));
				
	}
}
