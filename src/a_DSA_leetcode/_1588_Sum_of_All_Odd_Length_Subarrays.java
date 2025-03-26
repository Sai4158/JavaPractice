package a_DSA_leetcode;

public class _1588_Sum_of_All_Odd_Length_Subarrays {

	public static int sumOddLengthSubarrays(int[] arr) {

		int ans = 0;

		for (int i = 0; i < arr.length; i++) {

			int temp = 0;

			for (int j = i; j < arr.length; j++) {
				temp +=arr[j];

				if((j-i+1) % 2 == 1) {
					ans += temp;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));
	}
}
