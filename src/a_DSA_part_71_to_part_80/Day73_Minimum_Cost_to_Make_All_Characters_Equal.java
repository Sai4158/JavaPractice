package a_DSA_part_71_to_part_80;

public class Day73_Minimum_Cost_to_Make_All_Characters_Equal {

    public static long minimumCost(String s) {

    	long ans = 0;
    	
    	for (int i = 1; i < s.length(); i++) {
			
    		if(s.charAt(i) !=  s.charAt(i - 1) ) {
    			ans += Math.min(i, s.length()-i);
    		}
    		
		}
    		
    	return ans;
    }
    
    public static void main(String[] args) {
		String s = "0011";
		System.out.println(minimumCost(s));
	}
	
}
