package a_DSA_leetcode;

import java.util.Arrays;

public class _2706_Buy_Two_Chocolates {
	
    public static int buyChoco(int[] prices, int money) {
        
    	int n =  prices.length;
    	
    	Arrays.sort(prices);
    	int total =  prices[0] +  prices[1];
    	
    	if(total <= money) {
    		return money -  total;
    	}else {
    		return money;
    	}
    }
	
	public static void main(String[] args) {
		int prices[] = {1,2,2};
		int money = 3;
		System.out.println(buyChoco(prices, money));
	}
}
