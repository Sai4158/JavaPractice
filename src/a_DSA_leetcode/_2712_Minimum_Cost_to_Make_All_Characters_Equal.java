package a_DSA_leetcode;

public class _2712_Minimum_Cost_to_Make_All_Characters_Equal {
	
    public static long minimumCost(String s) {
        
    	long ans = 0;
    	
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
            	ans += Math.min(i, s.length() - i);
            }
		}
        
        return ans;
    	
    }
	
	public static void main(String[] args) {
		String n =  "0011";
		System.out.println(minimumCost(n));
	}
}
