package a_DSA_part_61_to_part_70;

import java.util.Arrays;

public class Day68_BuyTwoChocolates {
	
    public static int buyChoco(int[] prices, int money) {

    	int n = prices.length;
    	Arrays.sort(prices);
    	
    	int sum  =  prices[0] + prices[1];
    	
    	if(sum<= money) {
    		return money - sum;
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
