package a_DSA_leetcode;

import java.util.ArrayList;

public class _2390_Removing_Stars_From_a_String {

	public static String removeStars(String s) {

		ArrayList<Character> AL = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				if (!AL.isEmpty()) { 
					AL.remove(AL.size() - 1); 
				}
			} else {
				AL.add(s.charAt(i)); 
			}
		}

		String ans = "";
		for (char ch : AL) {
			ans += ch;
		}

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(removeStars("leet**cod*e")); 
	}
}
