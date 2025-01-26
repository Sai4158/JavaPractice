package a_DSA_leetcode;

public class _3146_Permutation_Difference_between_Two_Strings {
	
	
    public static int findPermutationDifference(String s, String t) {
        
    	int ans = 0;
    	
    	for (int i = 0; i < t.length(); i++) {
			
    		char c = t.charAt(i);
    		
    		for (int j = 0; j < s.length(); j++) {
				char cs = s.charAt(j);
				
				if(c == cs) {
					ans += Math.abs(j - i);
					break;
				}
			}
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		
		String s = "abc", t = "bac";
		System.out.println(findPermutationDifference(s, t));
	}
}
