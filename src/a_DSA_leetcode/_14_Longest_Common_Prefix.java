package a_DSA_leetcode;

public class _14_Longest_Common_Prefix {

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		
		String ans = "";
		
		
		for (int i = 0; i < strs.length; i++) {
			char c = strs[0].charAt(i);
			
			for (int j = 1; j < strs.length; j++) {
				
//				False  here
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                	return ans;
                }
			}
			
			ans += c;
		}
		return ans;
	}

	public static void main(String[] args) {
		String[] strs1 = {"flower", "flow", "flight"};
		System.out.println(longestCommonPrefix(strs1));
	}
}
