package a_DSA_part_61_to_part_70;

import java.util.Stack;

public class Day61_FinalPricesWithaSpecialDiscountinaShop {
	
    public static int[] finalPrices(int[] prices) {
    
    	int n = prices.length;
    	int ans[] = new int [n];
    	
    	Stack<Integer> st = new Stack<>();
    	
    	for (int i = 0; i < ans.length; i++) {
			
    		
    		while(!st.empty() && st.peek() > prices[i]) {
    			
    			st.pop();
    			
    		}
    			
    			
    		if(!st.isEmpty()) {
    			ans[i] = prices[i] - st.peek();
    		}else {
    			ans[i] = prices[i];
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
