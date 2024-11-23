package a_DSA_leetcode;

import java.sql.Array;
import java.util.Arrays;

public class _2144_Minimum_Cost_of_Buying_Candies_With_Discount {
	public static int minimumCost(int[] cost) {

		Arrays.sort(cost);
		int n = cost.length;
		int took = 0;
		int ans = 0;
		
		for (int i = n-1; i>=0; i--) {
			
			if(took == 2) {
				took = 0;
			}else {
				ans += cost[i];
				took++;
			}
		}
		
		return ans;
	}

//	Main
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		System.out.println(minimumCost(arr));
	}

}
