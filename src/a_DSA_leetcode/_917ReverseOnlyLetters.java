package a_DSA_leetcode;

public class _917ReverseOnlyLetters {

	public static String reverseOnlyLetters(String s) {

		char[] ch =  s.toCharArray();


		int n =  s.length();
		int  i = 0;
		int j = n - 1;

		while(i<j) {

			if(!Character.isLetter(ch[i])) {

				i++;
			}

			else if(!Character.isLetter(ch[j])) {

				j--;
			}
			
			else {
				char temp = ch[i];
				
				ch[i] =  ch[j];
				ch[j] =  temp;
				
				i++;
				j--;
			}

		}
		
		return new String(ch);

	}

	public static void main(String[] args) {
		String  s = "ab-cd";
		System.out.println(reverseOnlyLetters(s));
	}

}
