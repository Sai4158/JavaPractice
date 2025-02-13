package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1431_Kids_With_the_Greatest_Number_of_Candies {


	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		ArrayList<Boolean> al = new ArrayList<>();

		int ans = 0;
		int n = candies.length;
		int candy = candies[0];


		for (int i = 1; i < n; i++) {
			if (candies[i] > candy) {
				candy = candies[i];
			}
		}


		for (int i = 0; i < n; i++) {
			ans = candies[i] + extraCandies;
			if (ans >= candy) {
				al.add(true);
			} else {
				al.add(false);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		int candies[] = {2,3,5,1,3}, extraCandies = 3;

		System.out.println(kidsWithCandies(candies, extraCandies));
	}
}
