package a_DSA_leetcode;

import java.util.Arrays;

public class _1833_Maximum_Ice_Cream_Bars {

	 public static int maxIceCream(int[] costs, int coins) {
	        Arrays.sort(costs);  
	        int l = 0, r = 0, sum = 0, count = 0;

	        while (r < costs.length) {
	            sum += costs[r];
	            r++;

	            while (sum > coins) {  
	                sum -= costs[l];
	                l++;
	            }

	            count = Math.max(count, r - l);
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int[] costs = {1, 3, 2, 4, 1};
	        int coins = 7;
	        System.out.println(maxIceCream(costs, coins));  
	    }
}
