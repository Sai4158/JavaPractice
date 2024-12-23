package a_DSA_leetcode;

public class _1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
	
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;

        
//        removes the last digit from i
        for (int i = n; i > 0; i = i / 10) {
        	
        	
//        	extracts the last digit of i
            int num = i % 10; 
            sum = sum + num;  
            pro = pro * num;  
        }

        return pro - sum; 
    }
	
	
	
	public static void main(String[] args) {
		int n = 65567;
		System.out.println(subtractProductAndSum(n));
	}
}
