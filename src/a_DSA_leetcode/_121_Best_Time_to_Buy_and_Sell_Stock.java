package a_DSA_leetcode;

public class _121_Best_Time_to_Buy_and_Sell_Stock {
	public static int maxProfit(int[] prices) {
		int profit =0;

		for(int i = 0; i<prices.length-1; i++){
			// second loop for i+1
			for(int j=i+1; j<prices.length;j++){

				int  temp = prices[j] - prices[i];

				profit = Math.max(temp, profit);

			}

		}
		return profit;
	}   

	public static void main(String[] args) {
		int ab[] = {4,5,6,34,5,64};
		System.out.println(maxProfit(ab));
		
		
	}
}