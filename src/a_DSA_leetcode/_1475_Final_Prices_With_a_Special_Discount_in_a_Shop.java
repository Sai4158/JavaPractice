package a_DSA_leetcode;

import java.awt.image.RescaleOp;
import java.util.Stack;

public class _1475_Final_Prices_With_a_Special_Discount_in_a_Shop {
	
    public static int[] finalPrices(int[] prices) {
        
    	int n =  prices.length;
    	int ans[] =  new int[n];
    	Stack<Integer> st =  new Stack<>();
    	
        for (int i = n - 1; i >= 0; i--) {
    		
    		while(!st.isEmpty() && st.peek() > prices[i]) {
    			
    			st.pop();
    			
    		}
    		
    		
    		if(!st.isEmpty()) {
    			ans[i] = prices[i] - st.peek();
    		}else {
    			ans[i] =  prices[i];
    		}
    		
    		st.push(prices[i]);
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		int prices[] = {8,4,6,2,3};
		System.out.println(finalPrices(prices));
	}
}
