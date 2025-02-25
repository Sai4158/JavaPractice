package a_DSA_leetcode;

public class _2064_Minimized_Maximum_of_Products_Distributed_to_Any_Store {

	public static int minimizedMaximum(int n, int[] quantities) {

		int l = 1;
		int r = (int) Math.pow(10, 5);
		int count = 0;

		while(l<=r) {

			int mid =  l +(r-l)/2;

			if(IsPossible(n, quantities, mid)) {
				count ++;
				r =  mid -1;
			}
			else {
				l = mid +1;
			}
		}
		return l;

	}

	public static boolean IsPossible(int n, int[] quantities, int limit) {

		for (int i = 0; i < quantities.length; i++) {

			int val =  quantities[i];

			int temp =  val / limit;

			if(val % limit !=0) {
				temp++;
			}

			n-= temp;

			if(n<0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		int n = 6, quantities[] = {11,6};

		System.out.println(minimizedMaximum(n, quantities));
	}
}
