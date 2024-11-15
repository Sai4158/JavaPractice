package a_DSA_part_21_to_part_30;

public class Day20SlidingWindow {
		public static void main(String[] args) {
			
			int arr[]  = {2,3,4,5,6};
			
			int n = arr.length;
			
			int temp = 0;
			int l = 0;
			int ans = 0;
			int sl = 3;
			
			for (int i = 0; i < n; i++) {
				temp += arr[i];
				
				if(i-l==sl) {
					temp -= arr[l];
					l++;
				}
				
				if(i-l+1 == sl) {
					ans =  Math.max(ans, temp);
				}
			}
			System.out.println(ans);
		}
}
