package a_DSA_part_31_to_part_40;

import java.util.HashSet;

public class Day34UniqueCharcters {
	public static void main(String[] args) {
		
		HashSet<Character> s1 =  new HashSet<Character>();
		
		String a = "abewfwec";
		
		int n  =  a.length();
		
		for (int i = 0; i < n; i++) {
			
			char ch = a.charAt(i);
			
			s1.add(ch);
			
		}

		
		if(s1.size() == n) {
			System.out.println("This is Unique");
		}else {
			System.out.println("This is not Unique");
		}
	}
}
