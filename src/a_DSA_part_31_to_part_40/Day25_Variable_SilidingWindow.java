package a_DSA_part_31_to_part_40;

public class Day25_Variable_SilidingWindow {
	public static void main(String[] args) {
		
		int arr[] = {1,5,3,1,9};
		int  n = arr.length;
		int k = 10;
		int temp = 0;
		int ans = 0;
		int l = 0;
		
		for (int r = 0; r < n; r++) {
			temp += arr[r];
			
			while(temp > k) {
				temp -= arr[l];
				l++;
			}
			
			
			ans = Math.max(ans, r-l+1);
			
			
		}
		
		System.out.println(ans);
	}
}	
