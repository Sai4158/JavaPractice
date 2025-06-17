package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _3285_Find_Indices_of_Stable_Mountains {

	public static List<Integer> stableMountains(int[] height, int threshold) {

		List<Integer> ans = new ArrayList<Integer>();

		for (int i = 1; i < height.length; i++) {

			if(height[i-1] > threshold){
				ans.add(i);
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		int[] height = {10, 1, 10, 1, 10};
		int threshold = 3;
		System.out.println(stableMountains(height, threshold));
	}
}
