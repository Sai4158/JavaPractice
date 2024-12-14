package a_DSA_part_31_to_part_40;

import java.util.ArrayList;
import java.util.HashMap;

import arrayList_Vector_P46.List;

public class Day30_FindAllAnagramsInAString {
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		int l = 0;
		int k = p.length();
		int n = s.length();

		HashMap<Character, Integer> hm = new HashMap<>();
		HashMap<Character, Integer> hm1 = new HashMap<>();

		for (int i = 0; i < p.length(); i++) {
			char ch = p.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		for (int r = 0; r < n; r++) {
			char ch = s.charAt(r);
			hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);

			if (r - l + 1 == k) {
				if (hm1.equals(hm)) {
					result.add(l);
				}
				char chl = s.charAt(l);
				hm1.put(chl, hm1.get(chl) - 1);
				if (hm1.get(chl) == 0) {
					hm1.remove(chl);
				}
				l++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String s = "abab";
		String p = "ab";
		
		System.out.println(findAnagrams(s,p));
	}
}
