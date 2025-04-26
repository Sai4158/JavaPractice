package a_DSA_leetcode;

public class _2485_Find_the_Pivot_Integer {

	public static int pivotInteger(int n) {


		for (int i = 1; i <= n; i++) {
			
			int left = 0;
			int rigth = 0;
			
			for (int j = 1; j <= i; j++) {
				left += j;
			}
			
			for (int j = i; j <= n; j++) {
				rigth += j;
			}
			
			if(left == rigth) {
				return i;
			}
			
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		int n = 8;

		System.out.println(pivotInteger(n));
	}
}
