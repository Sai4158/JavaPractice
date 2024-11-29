package a_DSA_part_31_to_part_40;

public class Day27_MaxOddSubarray {
	public static void main(String[] args) {
		
		
		int arr[] = {1,3,7,8,5,3,7,3,1,2,2,4,4};

		int l = 0;
		int k = 1;
		int temp = 0;
		int ans = 0;
		int n = arr.length;
		
		
		for (int r = 0; r < n; r++) {
			
			
			if(arr[r] % 2 == 1) {
				temp++;
			}
			
			while(temp > k) {
				
				if(arr[l] % 2 ==1) {
					temp--;
				}
				
				l++;
			}
			
			ans = Math.max(ans, r-l+1);
		}
		
		System.out.println(ans);
	}
}
