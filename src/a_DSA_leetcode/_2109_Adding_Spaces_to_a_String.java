package a_DSA_leetcode;

import java.util.HashSet;

public class _2109_Adding_Spaces_to_a_String {
	
    public static String addSpaces(String s, int[] spaces) {
        
    	HashSet<Integer> Sindex =  new HashSet<Integer>();
    	
    	StringBuilder SB =  new StringBuilder();
    	
    	for(int index : spaces) {
    		Sindex.add(index);
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		if(Sindex.contains(i)) {
    			SB.append(" ");
    		}
    			SB.append(s.charAt(i));
    		
		}
    	
    	return SB.toString();
    	
    }
	
	public static void main(String[] args) {
		String s1 = "LeetcodeHelpsMeLearn";
        int[] spaces1 = {8, 13, 15};
        System.out.println(addSpaces(s1, spaces1));
	}
}
