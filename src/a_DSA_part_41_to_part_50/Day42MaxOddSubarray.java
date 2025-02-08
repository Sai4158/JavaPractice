package a_DSA_part_41_to_part_50;

public class Day42MaxOddSubarray {
	
	public static int sub(int arr[]) {
		
		int n = arr.length;
		int l = 0;
		int temp = 0;
		int ans = 0;
		int k = 0;
		
		for (int i = 0; i < n; i++) {
			
			if(arr[i] % 2 != 0) {
				temp++;
			}
			
			while(temp > k) {
				if(arr[l] % 2 != 0) {
					temp--;
				}
				l++;
			}
			ans =  Math.max(ans, i-l+1);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,2,1,1,1,1};
		System.out.println(sub(arr));
	}
}
