package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _3211_Generate_Binary_Strings_Without_Adjacent_Zeros {

	public static List<String> validStrings(int n) {

		List<String> ans = new ArrayList<String>();

		int total =  (int)Math.pow(2, n);

		for (int i = 0; i < total; i++) {

			String binary = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');

			if(!binary.contains("00")) {
				ans.add(binary);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(validStrings(n));
	}
}
