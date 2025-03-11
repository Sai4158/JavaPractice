package a_DSA_part_51_to_part_60;

import java.util.ArrayList;

public class Day53reverseWords {

	public static String reverseWord(String s) {
		
		int n = s.length();
		ArrayList<String> al  = new ArrayList<String>();
		String word[] =  s.trim().split("\\s+");
		
		for (int i = word.length-1; i >=0; i--) {
			al.add(word[i]);
		}
		
		return String.join(" ", al);
	}
	
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWord(s));
	}
}
