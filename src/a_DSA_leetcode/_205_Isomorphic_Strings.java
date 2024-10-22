package a_DSA_leetcode;

import java.util.HashMap;

public class _205_Isomorphic_Strings {
	 public static boolean isIsomorphic(String s, String t) {
		 	
		 HashMap<Character, Character> h1 = new HashMap<Character, Character>();
		 HashMap<Character, Character> h2 = new HashMap<Character, Character>();
	     
		 for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			
			
			if(!h1.containsKey(a) && !h2.containsKey(b)) {
				h1.put(a, b);
				h2.put(b, a);
				System.out.println( h1.get(a));
			
			}
			
			else if((h1.containsKey(a) && h1.get(a)!=b) || (h2.containsKey(b) && h2.get(b)!=a)) {
				return false;
			}
			
		 }
		 
		 return true;
		 
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(isIsomorphic("foo","baa"));
//		 System.out.println(isIsomorphic("foo","bar"));
//		 System.out.println(isIsomorphic("egg","add"));
		 
		 System.out.println();
	}
}
