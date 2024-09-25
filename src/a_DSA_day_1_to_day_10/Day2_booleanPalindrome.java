package a_DSA_day_1_to_day_10;

public class Day2_booleanPalindrome {
	public static void main(String[] args) {
		
		String s = "sai";
		boolean panlindrome = true;
		
//		get the length
		int n = s.length();
	
		// int i =0 and until length/2
		for (int i = 0; i <n/2; i++) {
			//not equal to length - i -1
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				panlindrome =  false;
			}
		}
		
		
		if(panlindrome) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
