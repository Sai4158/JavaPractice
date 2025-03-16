package a_DSA_leetcode;

import java.util.ArrayList;

public class _2710_Remove_Trailing_Zeros_From_a_String {


	public static String removeTrailingZeros(String num) {
		ArrayList<Character> revList = new ArrayList<>();
		int n = num.length();


		for (int i = n - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') { 

				 for (int j = 0; j <= i; j++) {
	                    revList.add(num.charAt(j));
	                }
				break;
			}
		}
		
        String ans = "";
        for (char c : revList) {
            ans += c;
        }

        return ans;
    }

	public static void main(String[] args) {
		System.out.println(removeTrailingZeros("51230100")); 
	}
}
