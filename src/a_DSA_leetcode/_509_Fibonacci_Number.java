package a_DSA_leetcode;

public class _509_Fibonacci_Number {

	public static int fib(int n) {

		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		int a = 0;
		int b = 1;
		int ans = 0;
		
		
		for (int i = 2; i <= n; i++) {
			
			ans = a + b;
			
			a =  b;
			b =  ans;
			
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 4;
        System.out.println(fib(n));
	}
}




