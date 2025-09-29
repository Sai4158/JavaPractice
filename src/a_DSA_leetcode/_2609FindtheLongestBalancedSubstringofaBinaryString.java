package a_DSA_leetcode;

public class _2609FindtheLongestBalancedSubstringofaBinaryString {

	 public int findTheLongestBalancedSubstring(String s) {
	        int prevCount = 0, currCount = 1, ans = 0;

	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) == s.charAt(i - 1)) {
	                currCount++;
	            } else {
	                prevCount = currCount;
	                currCount = 1;
	            }
	            ans = Math.max(ans, 2 * Math.min(prevCount, currCount));
	        }

	        return ans;
	    }
	
}
