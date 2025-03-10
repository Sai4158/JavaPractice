package a_DSA_part_51_to_part_60;

public class SubArrayWithOddSumJava {
	
	public static int oddArray(int arr[], int k) {
		
		int temp = 0;
		int n =  arr.length;
		int l = 0;
		int ans = 0;
		
		for (int r = 0; r < n; r++) {
			if (arr[r] % 2 == 1) {
				temp++;
			}

	
			while (temp > k) {
				if (arr[l] % 2 == 1) {
					temp--;
				}
				l++; 
			}
			
			ans = Math.max(ans, r - l + 1);
		}
		return ans;
	}
 	
	
	public static void main(String[] args) {
		int arr[] = {5, 7, 3, 6, 8, 1, 7, 8, 4, 3, 6};
		int k = 1;
		System.out.println(oddArray(arr, k));
	}
}
