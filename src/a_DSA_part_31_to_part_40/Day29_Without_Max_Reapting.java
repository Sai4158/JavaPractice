package a_DSA_part_31_to_part_40;

import java.util.HashSet;

public class Day29_Without_Max_Reapting {

	public static String main(String[] args) {
		
		String s =  "pwwkew";
		int n = s.length();
		String ans = "";
		
		for (int i = 0; i < n-2; i++) {
			
			for (int j = 0; j < n; j++) {
				
				char ch = s.charAt(j);
				char ch1 = s.charAt(j+1);
				char ch2 = s.charAt(j+2);
				
				
				if(ch != ch1 ) {
					ans += s.charAt(j);
				}
				
			}
		}
		
		
		return ans;
		
		
	}
}
