package a_DSA_part_51_to_part_60;

import java.util.ArrayList;

public class Day55RemovingLastZeros {

	public static String removeTrailingZeros(String num) {

		ArrayList<Character> al = new ArrayList<Character>();
		int n = num.length();

		for (int i = n-1; i > 0 ; i--) {

			if(num.charAt(i) != '0') {
				for (int j = 0; j <= i; j++) {
					al.add(num.charAt(j));
				}
				break;
			}
		}

		String ans = "";
		for(char c : al) {
			ans +=c;
		}

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(removeTrailingZeros("51230100")); 
	}
}
