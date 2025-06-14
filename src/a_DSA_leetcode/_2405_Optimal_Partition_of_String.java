package a_DSA_leetcode;

import java.util.HashSet;

public class _2405_Optimal_Partition_of_String {

	public static int partitionString(String s) {

		int count = 1;
		HashSet<Character> hm = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			if(hm.contains(s.charAt(i))) {
				count++;
				hm.clear();
			}
			hm.add(s.charAt(i));


		}

		return count;

	}

	public static void main(String[] args) {
		String s = "abacaba";
		System.out.println(partitionString(s));
	}
}
