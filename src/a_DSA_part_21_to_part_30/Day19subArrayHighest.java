package a_DSA_part_21_to_part_30;

public class Day19subArrayHighest {
	public static void main(String[] args) {
		
		int arr[] = {3,5,6,2,4,7,2};
		int n = arr.length;
		int ans =0;		
		int SubLen = 3;
		
		
		
		for (int i = 0; i < n-SubLen; i++) {
			
			int k = i+SubLen-1;
			int temp = 0;
			
			for (int j = i; j <=k; j++) {
				temp += arr[j];
			}
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}
}
