package a_DSA_part_21_to_part_30;

public class Day22_MaxSubarraySum {
	public static void main(String[] args) {
		
		
		int arr[] = {4,5,6,3,5};
		int n  = arr.length;
		
		// Left pointer of the window
		int l=0;
		int temp=0;
		int ans=0;
		
		
		
		for (int r = 0; r < n; r++) {
			
			temp += arr[r];
			
			// r = 0, l = 0 -> temp = 4, ans = 0
			// r = 1, l = 0 -> temp = 9 (4 + 5), ans = 0
			// r = 2, l = 0 -> temp = 15 (4 + 5 + 6), ans = 0
			// r = 3, l = 0 -> temp = 18 (4 + 5 + 6 + 3), ans = 18
			// r = 4, l = 1 -> temp = 19 (5 + 6 + 3 + 5), ans = 19

			
            // Check if the window size is 4
			if(r-l == 3) {
				temp -= arr[r];
						
				l++;
			}
		
		ans =  Math.max(ans, temp);
		}
		
		System.out.println(ans);
	}
}
