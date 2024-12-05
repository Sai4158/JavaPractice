package a_DSA_part_31_to_part_40;

import java.util.HashSet;

public class Day29_LongestSubWithoutRepeatingWithHashSet {
	public static void main(String[] args) {
		
		String arr = "bbbbb";
		
		int n =  arr.length();
		int l = 0;
		int ans = 0;
		
		HashSet<Character> hs =  new HashSet<Character>();
		
		for (int r = 0; r < n; r++) {
			
			char ch = arr.charAt(r);
			
			if(!hs.contains(ch)) {
				hs.add(ch);
			}else {
				while(hs.contains(ch)) {
					
					hs.remove(arr.charAt(l));
					l++;
				}
				hs.add(ch);
			}
			
			ans = Math.max(ans, r-l+1);
		}
		
		System.out.println(ans);
		
	}
	
}
