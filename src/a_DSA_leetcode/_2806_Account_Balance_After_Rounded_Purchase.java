package a_DSA_leetcode;

public class _2806_Account_Balance_After_Rounded_Purchase {

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
            	
//    	f =  float
    	int cut =  Math.round(purchaseAmount/10.0f)*10;
    	
//    	return the count -  the original amount 100
    	return 100 - cut;
    	
    }
	
//    main
	public static void main(String[] args) {
		int purchaseAmount = 10;
		System.out.println(accountBalanceAfterPurchase(purchaseAmount));
	}
}
