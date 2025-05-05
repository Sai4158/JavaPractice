package a_DSA_leetcode;

public class _2124_Check_if_All_A_Appears_Before_All_B_s {

	public static boolean checkString(String s) {


		boolean checkB = false;  

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if(c == 'b') {
				checkB = true;
			}

			if(checkB == true && c == 'a') {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		System.out.println(checkString("aaabbb"));
	}
}
