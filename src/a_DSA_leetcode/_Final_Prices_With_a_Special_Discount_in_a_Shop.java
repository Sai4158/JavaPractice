package a_DSA_leetcode;

public class _Final_Prices_With_a_Special_Discount_in_a_Shop {

    public static int[] finalPrices(int[] prices) {

        // get size of array
        int n = prices.length;

        // answer array to store final prices
        int ans[] = new int[n];

        // check each item one by one
        for (int i = 0; i < n; i++) {

            // by default, final price is the original price
            ans[i] = prices[i];

            // look for the first item on the right
            // whose price is smaller than or equal to current price
            for (int j = i + 1; j < n; j++) {

                // if valid discount found
                if (prices[j] <= prices[i]) {

                    // apply discount
                    ans[i] = prices[i] - prices[j];

                    // stop at the first valid discount
                    break;
                }
            }
        }

        // return final prices array
        return ans;
    }

    public static void main(String[] args) {

        int prices[] = {8, 4, 6, 2, 3};

        System.out.println(java.util.Arrays.toString(finalPrices(prices)));
    }
}