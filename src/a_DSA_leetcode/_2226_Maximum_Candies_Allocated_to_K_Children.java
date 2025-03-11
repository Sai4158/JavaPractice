package a_DSA_leetcode;

public class _2226_Maximum_Candies_Allocated_to_K_Children {
	
	public static int maximumCandies(int[] candies, long k) {

		int l = 1;
		int n =  candies.length;
		int r = (int) Math.pow(10, 7);
		
		
		while(l<=r) {
			int mid  = l + (r-l)/2;
			
			if(IsPossible(candies, k, mid)) {
				l =  mid + 1;
			}else {
				r = mid - 1;
			}
		}
		return r;
	}
	
	public static boolean IsPossible(int[] candies, long k, int mid) {
		
		for (int i = 0; i < candies.length; i++) {
			
			int temp = (int) (candies[i]/mid);
			k -= temp;
			
			if(k<=0) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int candies[] = {5,8,6}, k = 3;
		System.out.println(maximumCandies(candies, k));
	}
}
