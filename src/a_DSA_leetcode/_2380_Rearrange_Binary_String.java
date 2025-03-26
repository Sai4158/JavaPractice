package a_DSA_leetcode;

public class _2380_Rearrange_Binary_String {

	public static int secondsToRemoveOccurrences(String s) {

		int n =  s.length();
		int ans = 0;
		int zeroCount = 0;

		for (int i = 0; i < n; i++) {

			if(s.charAt(i) == '0') {
				zeroCount++;
			}

//			
			else if(zeroCount > 0) {

				ans = Math.max(ans+1, zeroCount);
			}

		}

		return ans;

	}

	public static void main(String[] args) {
		String s = "11100";

		System.out.println(secondsToRemoveOccurrences(s));
	}
}
