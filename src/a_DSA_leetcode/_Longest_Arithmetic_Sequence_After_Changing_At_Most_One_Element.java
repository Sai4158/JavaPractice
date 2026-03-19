package a_DSA_leetcode;

public class _Longest_Arithmetic_Sequence_After_Changing_At_Most_One_Element {

    public static int longestArithmetic(int[] nums) {

        // Get the size of the array
        int n = nums.length;

        // Minimum arithmetic subarray length is 2
        int maxLen = 2;

        // Try every index as the starting point
        for (int i = 0; i < n - 1; i++) {

            // Find the starting difference
            int d = nums[i + 1] - nums[i];

            // Current length starts with first 2 elements
            int len = 2;

            // Track if we already used our one allowed change
            boolean usedChange = false;

            // Check the rest of the array from this starting point
            for (int j = i + 2; j < n; j++) {

                // Difference between current element and previous element
                int currDiff = nums[j] - nums[j - 1];

                // If difference matches, continue arithmetic sequence
                if (currDiff == d) {
                    len++;
                } else {

                    // If we have not used the one change yet,
                    // pretend we fix this bad element
                    if (!usedChange) {
                        usedChange = true;
                        len++;
                    } else {
                        // If one change is already used, stop this sequence
                        break;
                    }
                }
            }

            // Update maximum length found so far
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int nums[] = {9, 7, 5, 10, 1};

        System.out.println(longestArithmetic(nums));
    }
}