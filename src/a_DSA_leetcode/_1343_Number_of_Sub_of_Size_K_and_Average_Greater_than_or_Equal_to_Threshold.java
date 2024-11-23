package a_DSA_leetcode;

public class _1343_Number_of_Sub_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {
	
	 public static int numOfSubarrays(int[] arr, int k, int threshold) {
	        
		int n = arr.length;
		int l = 0;
		int temp = 0;
		int ans = 0;
		
		
		for (int i = 0; i < n; i++) {
			temp += arr[i];
			
			
			if(i-l ==k) {
				temp = temp - arr[l];
				l++;
			}
			
			if(i-l+1==k) {
				if(temp/k >= threshold) {
					ans++;
				}
				
			}
		}
		
		return ans;
	 }
	 
	 
	 
	 
//	 Main method 
	 
	 public static void main(String[] args) {
		int arr[] = {2,2,2,2,5,5,5,8};
		int k = 3;
		int threshold = 4;
		
		System.out.println(numOfSubarrays(arr, k, threshold));
	}
}
