package a_DSA_leetcode;

import java.util.HashSet;
import java.util.Set;

public class _2506_Count_Pairs_Of_Similar_Strings {

	public static int similarPairs(String[] words) {

		int n =  words.length;
		int count = 0;

		//		add all the i
		for (int i = 0; i <n; i++) {
			Set<Character> set1 = new HashSet<Character>();
			for (char c : words[i].toCharArray()) {
				set1.add(c);
			}

			//			add all the i + 1
			for (int j = i+1; j < n; j++) {
				Set<Character> set2 = new HashSet<Character>();

				for (char c : words[j].toCharArray()) {
					set2.add(c);
				}

				
				if(set1.equals(set2)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
	}
}
