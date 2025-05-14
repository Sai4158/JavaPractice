package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class _1561_Maximum_Number_of_Coins_You_Can_Get {

	public static int maxCoins(int[] piles) {

		int n =  piles.length;
		Arrays.sort(piles);
		int my = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			al.add(piles[i]);
		}

		for (int i = 0; i < n/3; i++) {

			al.remove(0);                        // Bob gets smallest
			al.remove(al.size() - 1);            // Alice gets largest


			my += al.remove(al.size() - 1);      // I get it

		}


		return my;
	}

	public static void main(String[] args) {
		int  piles[] = {2,4,1,2,7,8};
		System.out.println(maxCoins(piles));
	}
}
