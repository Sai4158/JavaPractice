package a_DSA_part_21_to_part_30;

public class Day23_SubArrayMinValues {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,7};
		
		int n =  arr.length;
		
		int l = 0;
		
		int k = 3;
		
		int ans = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < n; i++) {
						
			if(i-l == k) {
				l++;
			}
			
			if(i-l+1 == k) {
				int temp = arr[i] - arr[l];
				
				ans =  Math.min(ans, temp);
			}
		}
		
		System.out.println(ans);
				
	}
}
