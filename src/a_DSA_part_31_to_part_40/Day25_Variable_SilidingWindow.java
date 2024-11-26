package a_DSA_part_31_to_part_40;

public class Day25_Variable_SilidingWindow {
	public static void main(String[] args) {
		
		int arr[] = {1,8,3,7,5,6};
		int  n = arr.length;
		int k = 3;
		int temp = 0;
		int ans = 0;
		int l = 0;
		
		for (int r = 0; r < n; r++) {
			temp += arr[r];
			
			if(r-l == k) {
				temp -= arr[l];
				l++;
			}
			
			if(r-l+1 == k) {
				ans = Math.max(ans, temp);
			}
			
		}
		
		System.out.println(ans);
	}
}	
