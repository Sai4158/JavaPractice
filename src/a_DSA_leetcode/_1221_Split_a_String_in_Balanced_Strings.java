package a_DSA_leetcode;

public class _1221_Split_a_String_in_Balanced_Strings {


	public static int balancedStringSplit(String s) {
		
		int lcount =0;
		int rcount =0;
		
		int ans = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)== 'R') {
				rcount++;
			}else if(s.charAt(i)== 'L') {
				lcount++;
			}
			
			if(lcount == rcount) {
				ans++;
				
				lcount= 0;
				rcount= 0;
			}
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
	}


}
