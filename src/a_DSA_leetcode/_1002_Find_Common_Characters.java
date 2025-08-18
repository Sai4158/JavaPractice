package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1002_Find_Common_Characters {

	public static List<String> commonChars(String[] words) {

		List<String> common =  new ArrayList<String>();

		for (char c : words[0].toCharArray()) {

			common.add(String.valueOf(c));

		}


		for (int i = 1; i < words.length; i++) {

			List<String> current =  new ArrayList<String>();


			for (char c : words[i].toCharArray()) {

				current.add(String.valueOf(c));

			}

		 // Build intersection
            List<String> next = new ArrayList<>();
            for (String ch : common) {
                if (current.contains(ch)) {
                    next.add(ch);
                    current.remove(ch); // consume one occurrence
                }
            }

            common = next; // update
        }

        return common;
    }

	public static void main(String[] args) {
		String[] words1 = {"bella", "label", "roller"};
		System.out.println(commonChars(words1)); 
	}
}
