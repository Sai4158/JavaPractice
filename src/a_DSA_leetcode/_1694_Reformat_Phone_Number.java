package a_DSA_leetcode;

import java.util.ArrayList;

public class _1694_Reformat_Phone_Number {

	public static String reformatNumber(String number) {

		ArrayList<Character> al = new ArrayList<>();
		int n = number.length();
		String ans = "";
		
		for (int i = 0; i < n; i++) {
			if (Character.isDigit(number.charAt(i))) {
				al.add(number.charAt(i));
			}
		}

		
		for (int i = 0; i < al.size(); ) {
			
			int check = al.size() - i;

			if (check > 4) {
				ans += al.get(i) + "" + al.get(i + 1) + "" + al.get(i + 2) + "-";
				i += 3;
			} 
			
			else if (check == 4) {
				ans += al.get(i) + "" + al.get(i + 1) + "-";
				ans += al.get(i + 2) + "" + al.get(i + 3);
				break;
			} 
			
			else if (check == 3) {
				ans += al.get(i) + "" + al.get(i + 1) + "" + al.get(i + 2);
				break;
			} 
			
			else if (check == 2) {
				ans += al.get(i) + "" + al.get(i + 1);
				break;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		String number = "1-23-45 6";
		System.out.println(reformatNumber(number)); 
	}
}
