package a_DSA_leetcode;

public class _1952_Three_Divisors {
		public static boolean isThree(int n) {

			int count = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {  
					count++;
				}
			}

			if(count == 3){
				return true;
			}else{
				return false;
			}
		}
	
		public static void main(String[] args) {
			int n = 4;
			System.out.println(isThree(n));
		}

}
