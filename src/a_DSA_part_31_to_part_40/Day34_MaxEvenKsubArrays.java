package a_DSA_part_31_to_part_40;

public class Day34_MaxEvenKsubArrays {
	
	public static void main(String[] args) {
		
		int k = 1;
		int temp = 0;
		int ans = 0;
		int l = 0;

		int arr[] = {2,2,2,3};
		
		int n = arr.length;
		
		
		for (int r = 0; r < arr.length; r++) {
			
			
			if(arr[r] % 2 != 1) {
				temp++;
			}
			
			
			while(temp>k) {
				
				if(arr[l] % 2 != 1) {
					temp--;
				}
				l++;
			}
			
			
			ans = Math.max(ans, r-l+1);
		}
		
		System.out.println(ans);
		
	}
}
