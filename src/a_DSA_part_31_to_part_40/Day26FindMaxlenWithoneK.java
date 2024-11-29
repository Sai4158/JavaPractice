package a_DSA_part_31_to_part_40;

public class Day26FindMaxlenWithoneK {
	public static void main(String[] args) {
		
		
		int arr[] = {2,4,5,2,5,2,2,5,4,3,2,1, 1};

		int l = 0;
		int k = 3;
		int temp = 0;
		int ans = 0;
		int n = arr.length;
		
		
		for (int r = 0; r < n; r++) {
			
			
			if(arr[r] ==  2) {
				temp++;
			}
			
			
			while(temp> k) {
				if(arr[l] == 2) {
					temp--;
				}
				l++;
			}
			
			ans =  Math.max(ans, temp);
		}
		
		System.out.println(ans);
	}
}
