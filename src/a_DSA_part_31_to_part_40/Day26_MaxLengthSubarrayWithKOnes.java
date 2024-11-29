package a_DSA_part_31_to_part_40;

public class Day26_MaxLengthSubarrayWithKOnes {
	public static void main(String[] args) {

		int arr[] = {1,2,4,5,65,67};

		int l = 0;
		int k = 2;
		int temp = 0;
		int ans = 0;
		int n = arr.length;



		for (int i = 0; i < n; i++) {

            // Increment the count of ones if the current element is 1
			if(arr[i] == 1) {
				temp ++;
			}
			
			
            // If the count of ones exceeds k, shrink the window from the left
			while(temp> k) {
				if(arr[l] ==1) {
					temp--;
				}
				
                // Move the left pointer forward to shrink the window
				l++;
			}
			
            // Update the maximum length of the subarray
			ans = Math.max(ans, i-l-1);
		}
		
		System.out.println(ans);
	}
}
