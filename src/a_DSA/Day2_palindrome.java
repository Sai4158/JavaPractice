package a_DSA;

public class Day2_palindrome {
	public static void main(String[] args) {
//		If a reverse string is same with the original string  then it is called the palindrome 


		String s  =  "sai";
		String Ans  = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
//			will use .chatAt to print the each letter
			Ans = Ans + s.charAt(i);			
	
		}
		System.out.println();
		if(Ans.equals(s)) {
			System.out.println("Yes this is a pandlindrome");
		}
		else {
			System.out.println("This is not a pandlindrome");
		}
	}
}


//bbbbbbbbbb
//Yes this is a pandlindrome

//ababa
//Yes this is a pandlindrome

//sai
//This is not a pandlindrome