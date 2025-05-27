package a_DSA_leetcode;

import java.util.ArrayList;


public class _1859_Sorting_the_Sentence {

	public static String sortSentence(String s) {

		String[] words =  s.split(" ");
		int n =  words.length;
		String[] result =  new String[n];

		for(String word :  words) {

			int index  = word.charAt(word.length()-1) - '1';

			result[index] = word.substring(0, word.length() -1);

		}

		return String.join(" ", result);

	}

	public static void main(String[] args) {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}
}
