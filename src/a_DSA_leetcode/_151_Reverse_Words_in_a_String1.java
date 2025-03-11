package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class _151_Reverse_Words_in_a_String1 {

	public static String reverseWords(String s) {

		String ans = "";
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList(s.trim().split("\\s+"))); 

		for (int i = l1.size() - 1; i >= 0; i--) {  
			ans += l1.get(i) + " ";  
		}

		return ans.trim();  

	}

	public static void main(String[] args) {
		System.out.println(reverseWords("  hello world  "));
	}
}
