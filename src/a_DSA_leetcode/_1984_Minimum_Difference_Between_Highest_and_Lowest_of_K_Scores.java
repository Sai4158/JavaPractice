package a_DSA_leetcode;

import java.util.Arrays;

public class _1984_Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores {
    public static int minimumDifference(int[] nums, int k) {
       

    	  int n = nums.length;
          int minDiff = Integer.MAX_VALUE; 
          
          Arrays.sort(nums);

          for(int i = k-1; i <n; i++){

              int diff = nums[i] - nums[i-k+1];

              minDiff = Math.min(minDiff, diff);
          }

          if(k == 1){
              return 0;
          }
          

          return minDiff;
      }

    // Main
    public static void main(String[] args) {
        int arr[] = {9, 4, 1, 7};
        int k = 2;

        System.out.println(minimumDifference(arr, k)); 
    }
}
