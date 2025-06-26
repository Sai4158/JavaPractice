package a_DSA_leetcode;

public class _1362_Closest_Divisors {

	public static int[] closestDivisors(int num) {

		int ans[] = new int[2];
		int mindiff =  Integer.MAX_VALUE;


		for (int i = num + 1; i <= num + 2; i++) {

			for (int j = 1; j*j <= i; j++) {

				if(i % j == 0) {
					int a = j;
					int b = i / j;

					int diff = Math.abs(a - b);

					if(diff < mindiff) {
						mindiff = diff;
						ans[0]=a;
						ans[1]=b;
					}

				}



			}

		}

		return ans;
	}

	public static void main(String[] args) {
		int num = 123;
		int[] result = closestDivisors(num);
		System.out.println(result[0] + " " + result[1]);
	}
}
