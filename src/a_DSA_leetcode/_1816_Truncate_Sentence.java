package a_DSA_leetcode;

import java.sql.Array;
import java.util.ArrayList;

public class _1816_Truncate_Sentence {

	public static String truncateSentence(String s, int k) {
		
		String word[] = s.split(" ");
		
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i = 0; i < k; i++) {
			al.add(word[i]);
		}
		return String.join(" ", al);
	}

	public static void main(String[] args) {
		System.out.println(truncateSentence("Hello how are you Contestant", 4)); 
	}

}
