package a_DSA_leetcode;

public class _917_Reverse_Only_Letters {

	public static String reverseOnlyLetters(String s) {

		String rev = "";
		int nonLetter = s.length() - 1;

		 for (int i = 0; i < s.length(); i++) {
			 
	            if (Character.isLetter(s.charAt(i))) {
	            	
	                while (!Character.isLetter(s.charAt(nonLetter))) {
	                	nonLetter--;
	                }
	                
	                rev += s.charAt(nonLetter--); 
	                
	                
	            } else {
	            	
	                rev += s.charAt(i);
	                
	            }
	        }


		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
	}
}
