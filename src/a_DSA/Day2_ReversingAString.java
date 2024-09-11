package a_DSA;

public class Day2_ReversingAString {
	public static void main(String[] args) {
//		This will take a string and print in reverse 
		
		String s  =  "Coding";
		

		for (int i = s.length()-1; i >= 0; i--) {
//			will use .chatAt to print the each letter
			System.out.print(s.charAt(i));
		}
	}
}

