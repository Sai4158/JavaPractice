package a_DSA_part_21_to_part_30;

import java.util.ArrayList;


public class Day18_SubArray {
	public static void main(String[] args) {
		
		String s =  "I am sai";
		ArrayList<String> s1 = new ArrayList<String>();
		int n = s.length();
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				String temp =  s.substring(i,j+1);
				s1.add(temp);
			}
		}
		
		System.out.println(s1);
	}
}
