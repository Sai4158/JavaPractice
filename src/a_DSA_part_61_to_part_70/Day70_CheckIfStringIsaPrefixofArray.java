package a_DSA_part_61_to_part_70;

public class Day70_CheckIfStringIsaPrefixofArray {

	public static boolean isPrefixString(String s, String[] words) {

		int n =  words.length;
		
		String ans = "";
		
		for (int i = 0; i < n; i++) {
			
			ans += words[i];
			
			if(!s.contains(ans)) {
				return false;
			}
			
			if(ans.equals(s)) {
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "iloveleetcode";
		String[] words = {"apples","i","love","leetcode"};
		System.out.println(isPrefixString(s, words)); 
	}
}	
