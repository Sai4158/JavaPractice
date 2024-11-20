package a_DSA_leetcode;

import java.util.HashMap;

public class _1876_Substrings_of_Size_Three_with_Distinct_Characters_SubString {
    public static void main(String[] args) {
        
    	String s = "xyzabc";
        
//    	SubString  =  sliding window 
    	
    	int n  = s.length();
    	int ans = 0;
    	int k =3;
    	int l = 0;
    	
    	HashMap<Character, Integer> h1 = new HashMap<>();
    	
    	
    	for (int r = 0; r < n; r++) {
			char ch = s.charAt(r);
			h1.put(ch, h1.getOrDefault(ch, 0)+1);
			
			if(r-l ==3) {
				char tch = s.charAt(l);
				
				h1.put(tch, h1.get(tch)-1);
				
				if(h1.get(tch)==0) {
					h1.remove(tch);
				}
				l++;
			}
			
			if(h1.size() == 3) {
				ans++;
			}
		}
    	
    	System.out.println(h1);
    	
    	
    }
}
