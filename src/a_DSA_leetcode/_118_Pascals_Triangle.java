package a_DSA_leetcode;

import java.util.*;


public class _118_Pascals_Triangle {
	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> s1 = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

			ArrayList<Integer> s2 = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
					s2.add(1);
				}else {
					s2.add(s1.get(i-1).get(j-1) + s1.get(i-1).get(j));
				}
			}
			s1.add(s2);

		}
		return s1;

	}

	public static void main(String[] args) {
		int a = 5;

		System.out.println(generate(a));
	}
}	
