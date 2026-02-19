import java.util.Arrays;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int n = nums.length;

        // store indices
        Integer[] idx = new Integer[n];
        
        for (int i = 0; i < n; i++) {
        	idx[i] = i;
        }

        // sort indices by nums value (small -> big)
        Arrays.sort(idx, (a, b) -> Integer.compare(nums[a], nums[b]));

        // take last k indices (right side = biggest values)
        Integer[] pick = Arrays.copyOfRange(idx, n - k, n);

        // sort picked indices to keep original order (subsequence rule)
        Arrays.sort(pick);

        // build answer
        int[] ans = new int[k];
        
        for (int i = 0; i < k; i++) {
            ans[i] = nums[pick[i]];
        }

        return ans;
    }
}
