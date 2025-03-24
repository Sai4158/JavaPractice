package a_DSA_leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class _389_Find_the_Difference {

	public static char findTheDifference(String s, String t) {

		HashMap<Character, Integer> hmS =  new HashMap<>();
		HashMap<Character, Integer> hmT =  new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			hmS.put(s.charAt(i), hmS.getOrDefault(s.charAt(i), 0)+1);
		}


		for (int j = 0; j < t.length(); j++) {
			hmT.put(t.charAt(j), hmT.getOrDefault(t.charAt(j), 0)+1);
		}

		for(char ch : hmT.keySet()) {

			int countT = hmT.get(ch);
			int countS = hmS.getOrDefault(ch,0);


			if(countT>countS) {
				return ch;
			}
		}


		return  ' ';
	}

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde")); 
	}
}
