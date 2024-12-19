package a_DSA_part_31_to_part_40;

import java.util.HashMap;

import arrayList_Vector_P46.List;

public class Day30_CheckIfTheyAreAnagrams {
	
	public static List<Integer> findAnagrams(String s, String p) {
		
		int n =  s.length();
		
		int  l = 0;
		int k = p.length();
		
		
//		HashMap
		HashMap<Character, Integer> hms = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		
		
//		Frequency count 
		for (int i = 0; i < p.length(); i++) {
			char ch = p.charAt(i);
			hmp.put(ch, hmp.getOrDefault(ch, 0)+1);
				
			
		}
		
		
//		Update hashmap
		for (int r = 0; r < n; r++) {
			char ch = s.charAt(r);
			hms.put(ch, hms.getOrDefault(ch, 0)+1);
			
			if(r-l==k) {
				
				char chl =  s.charAt(l);
				hms.put(chl, hms.get(chl)-1);
				
				if(hms.get(chl)==0) {
					hms.remove(chl);
				}
				
				l++;
			}
			
			if(r-l== k) {
				System.out.println(hms);
			}
		}
	};
	
	
	
	
//	Main Method
	public static void main(String[] args) {
		
		 String s = "abac";
		 
		 String p = "ab";
		 
		 System.out.println(findAnagrams(s,p));
	}
}
