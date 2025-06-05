package a_DSA_leetcode;

import java.util.ArrayList;

public class _2678_Number_of_Senior_Citizens {

	public static int countSeniors(String[] details) {

		int count = 0;
		int n = details.length;

		for (int i = 0; i < n; i++) {

			String s = details[i];

			String age = s.substring(11, 13);

			int age1 = Integer.parseInt(age); 

			if(age1 > 60) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		String[] details1 = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
		System.out.println(countSeniors(details1));
	}
}
