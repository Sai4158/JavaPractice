package a_DSA_day_1_to_day_10;

public class Day2_recap {
	public static void main(String[] args) {
		
//		panlindrome
		
		String s = "iii";
		String check = "";
		
		for (int i = s.length()-1; i >=0 ; i--) {
			check = check + s.charAt(i);
		}
		
		if(s.equals(check)) {
			System.out.println("Yes this is a panlindrome");
		}else {
			System.out.println("This is not a panlindrome");
		}
	}
}
