package a_DSA_part_41_to_part_50;

import java.awt.PrintGraphics;

public class Day41KokoEatingSpeedLCProblem {

	public static int minEatingSpeed(int[] piles, int h) {

		int l = 1;
		int r = 999999999;

		while(l<=r) {
			int m = l+(r-l)/2;

			if(isPossible(piles, h,m)) {
				r = m - 1;
			}else {
				l = m + 1;
			}
		}
		return l;
	}

	public static boolean isPossible(int[] piles, int h, int m) {
		int n =  piles.length;


		for (int i = 0; i < piles.length; i++) {

			int val = piles[i];
			int temp =  val/m;

			if(val % m !=0) {
				temp++;

			}
			h -= temp;

			if(h<0) {
				return false;
			}

		}
		return true;

	}


	public static void main(String[] args) {
		int nums[] = {3,6,7,11};

		int h = 8;

		System.out.println(minEatingSpeed(nums, h));
	}
}
