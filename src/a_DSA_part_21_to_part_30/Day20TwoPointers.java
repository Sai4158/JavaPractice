package a_DSA_part_21_to_part_30;

public class Day20TwoPointers {
	public static void main(String[] args) {
		
		int arr[] = {4,3,4,8,3};
		int n =  arr.length;
		int temp = 0;
		int l = 0;
		
		
		for (int r = 0; r < n; r++) {
			
			temp += arr[r];
			
			if(r - l ==0) {
				temp-= arr[l];
				l++;
			}
			
			
			
			System.out.println(temp);
		}

	}
}
