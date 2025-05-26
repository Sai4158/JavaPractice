package a_DSA_leetcode;

import java.util.HashMap;

public class _3442_Maximum_Difference_Between_Even_and_Odd_Frequency_I {

	public static int maxDifference(String s) {


		HashMap<Character, Integer> hm1 = new HashMap<>();
		int n = s.length();
		int maxOdd = Integer.MIN_VALUE;
		int minEven = Integer.MAX_VALUE;


		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			hm1.put(ch, hm1.getOrDefault(ch,0)+1);
		}

		for (int c : hm1.values()) {
			if (c % 2 == 1) {
				maxOdd = Math.max(c, maxOdd);
			}else {
				minEven = Math.min(c, minEven); 
			}
		}

		return maxOdd - minEven;
	}

	public static void main(String[] args) {
		System.out.println(maxDifference("aaaaabbc"));
	}
}
