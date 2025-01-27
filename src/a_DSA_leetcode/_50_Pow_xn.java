package a_DSA_leetcode;

public class _50_Pow_xn {
	
    public static double myPow(double x, int n) {
        
        double a = Math.pow(x,n);

        return a;
    }
	
	public static void main(String[] args) {
		
		double x = 2.00000;
		int n = 10;
		
		System.out.println(myPow(x, n));
		
	}
}
