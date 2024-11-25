package a_DSA_part_21_to_part_30;

public class Day24_MaxSumSubarray {
	public static void main(String[] args) {
		
		
        int arr[] = {4, 3, 4, 8, 3};
		
		int k = 3;
		int temp = 0;
		int l = 0;
		int ans = 0;
		int n = arr.length;
		
		
		for (int r = 0; r < n; r++) {
			temp += arr[r];
			
			
			if(r-l==k) {
				temp-=arr[l];
				l++;
			}
			
			if (r - l + 1 == k) {
                ans = Math.max(ans, temp);
            }
			
		}
		
		
		System.out.println(ans);
	}
}
