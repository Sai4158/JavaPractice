package a_DSA_leetcode;

import java.util.ArrayList;

public class _1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {

	public static boolean areAlmostEqual(String s1, String s2) {

		int n =  s1.length();

		ArrayList<Integer> al = new ArrayList<Integer>();

		if(s1.contains(s2)) {
			return true;
		}

		for (int i = 0; i < n; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				al.add(i);
			}
		}

		if(al.size() != 2) {
			return false;
		}

		int a = al.get(0);
		int b = al.get(1);

		if(s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String  s1 = "bank", s2 = "kanb";
		System.out.println(areAlmostEqual(s1, s2));
	}
}
