package a_DSA_part_21_to_part_30;

import java.util.Iterator;

public class Day18_SubArray {
	public static void main(String[] args) {
		
		String s =  "I am sai";
		
		int n = s.length();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(s.substring(i,j+1));
			}
		}
	}
}
