package a_DSA_part_31_to_part_40;

public class Day31_MaxOdd_KsubArrays {
    public static void main(String[] args) {
        
        // Find the max k odd subarrays in the array
        int arr[] = {1,4,6,3,9,9,9,9,9};
        int l = 0;
        int temp = 0; 
        int ans = 0; 
        int k = 1;

     // Traverse the array with right pointer
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] % 2 == 1) {
                temp++;
            }
            
            while (temp > k) {
                if (arr[l] % 2 == 1) {
                    temp--;
                }
                l++;
            }
            
         // Update maximum length
            ans = Math.max(ans, r - l + 1);
        }

        System.out.println(ans);
    }
}
