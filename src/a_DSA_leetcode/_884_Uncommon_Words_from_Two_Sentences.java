package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class _884_Uncommon_Words_from_Two_Sentences {

	public static String[] uncommonFromSentences(String s1, String s2) {

		String combined = s1 + " " +  s2;
		String words[] = combined.split(" ");
		HashMap<String, Integer> hm =  new HashMap<String, Integer>();

		for (int i = 0; i < words.length; i++) {
			String word =  words[i];

			hm.put(word, hm.getOrDefault(word, 0)+1);
		}

		ArrayList<String> al =  new ArrayList<String>();
		for(String c : hm.keySet()) {

			if(hm.get(c) == 1) {
				al.add(c);
			}

		}
		return al.toArray(new String[0]);
	}

	public static void main(String[] args) {
		System.out.println(uncommonFromSentences("this apple is sweet", "this apple is sour"));
	}
}
