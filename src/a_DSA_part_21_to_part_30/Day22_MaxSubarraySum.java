package a_DSA_part_21_to_part_30;

public class Day22_MaxSubarraySum {
	public static void main(String[] args) {
		
		
		int arr[] = {4,5,6,3,5};
		int n  = arr.length;
		
		int l=0;
		int temp=0;
		int ans=0;
		
		
		
		for (int r = 0; r < n; r++) {
			
			temp += arr[r];
			
//			1-0
//			2-0
//			3-0
//			4-1 =  3
//			5-2 =  3
//			6-3 =  3

			if(r-l == 3) {
				temp -= arr[r];
						
				l++;
			}
		
		ans =  Math.max(ans, temp);
		}
		
		System.out.println(ans);
	}
}
