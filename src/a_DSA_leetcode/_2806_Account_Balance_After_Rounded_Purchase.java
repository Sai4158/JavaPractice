package a_DSA_leetcode;

public class _2806_Account_Balance_After_Rounded_Purchase {

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
            	
    	int cut =  Math.round(purchaseAmount/10.0f)*10;
    	
    	return 100 - cut;
    	
    }
	
	public static void main(String[] args) {
		int purchaseAmount = 10;
		System.out.println(accountBalanceAfterPurchase(purchaseAmount));
	}
}
