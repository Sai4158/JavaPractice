package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

import arrayList_Vector_P46.Arraylist;

public class _1408_String_Matching_in_an_Array {

	public static List<String> stringMatching(String[] words) {

		List<String> ans = new  ArrayList<String>();

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {

				if (i != j && words[i].contains(words[j])) {
                    if (!ans.contains(words[j])) {
                        ans.add(words[j]);
                    }
                }

			}
		}
    	return ans;
    }

	public static void main(String[] args) {
		String words[] = {"mass","as","hero","superhero"};

		System.out.println(stringMatching(words));

	}
}
