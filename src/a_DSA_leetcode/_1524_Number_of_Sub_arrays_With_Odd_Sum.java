package a_DSA_leetcode;

public class _1524_Number_of_Sub_arrays_With_Odd_Sum {

	public static int numOfSubarrays(int[] arr) {
        int mod = (int)1e9 + 7;
        int oddPrefix = 0;
        int evenPrefix = 1;
        int sum = 0;
        int ans = 0;

        for (int num : arr) {
            sum += num;

            if (sum % 2 == 0) {
                ans = (ans + oddPrefix) % mod;
                evenPrefix++;
            } else {
                ans = (ans + evenPrefix) % mod;
                oddPrefix++;
            }
        }

        return ans;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,3,5};
		System.out.println(numOfSubarrays(arr));
	}
}
