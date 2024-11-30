package a_DSA_part_31_to_part_40;

public class Day27_MaxEvenSubarray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,2,1,1,1,1};

		int l = 0;
		int k = 1; // Maximum allowed even numbers
		int temp = 0; // Count of even numbers in the current window
		int ans = 0; // Maximum length of the subarray
		int n = arr.length;
		
		
		for (int r = 0; r < n; r++) {
			if(arr[r] % 2 == 0) {
				temp++;
			}
			
			while(temp > k) {
				if(arr[l] % 2 == 0) {
					temp--;
				}
				l++;
			}
			
			ans = Math.max(ans, r-l+1);
			
		}
		
		System.out.println(ans);
		
		
		
	}
}
