package a_DSA_part_31_to_part_40;

public class Day28_BinaryArrayMaxKSubArray {
	public static void main(String[] args) {
		
		
		int arr[] = {1,1,0,1,0,0,0};

		int l = 0;
		int k = 2; 
		int temp = 0;
		int ans = 0; 
		int n = arr.length;
		
		
		for (int r = 0; r < n; r++) {
			
//			Add if
			
			if(arr[r] == 0 ) {
				temp ++;
			}
			
			
			while(temp > k) {
				if(arr[l]==0) {
					temp--;
				}
				l++;
			}
			ans = Math.max(ans, r-l+1);
			
		}
		
		System.out.println(ans);
		
	}
}
