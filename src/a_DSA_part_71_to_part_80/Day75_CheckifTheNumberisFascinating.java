package a_DSA_part_71_to_part_80;

import java.util.HashSet;

public class Day75_CheckifTheNumberisFascinating {
	
	public static boolean isFascinating(int n) {

		
		String s = "" +  n + (2 * n) + (3 * n);
		
		if(s.length() < 9) {
			return false;
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			int digit  = s.charAt(i) - '0';
			
			if(digit == 0 || hs.contains(digit)) {
				return false;
			}
			
			
			hs.add(digit);
			
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		int n = 192;
		System.out.println(isFascinating(n));
	}
}
