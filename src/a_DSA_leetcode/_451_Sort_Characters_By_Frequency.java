package a_DSA_leetcode;

import java.util.HashMap;

public class _451_Sort_Characters_By_Frequency {

	public static String frequencySort(String s) {

		int n =  s.length();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {

			char c =  s.charAt(i);

			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		String ans = "";
		while(!hm.isEmpty()) {

			int max  = 0;
			char maxChar = ' ';

			for(char c : hm.keySet()) {

				if(hm.get(c) > max) {
					max =  hm.get(c);
					maxChar = c;
				}

			}

			for (int i = 0; i < max; i++) {
				ans += maxChar;
			}
			
			hm.remove(maxChar);
		}


		return ans;
	}

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));
	}
}
