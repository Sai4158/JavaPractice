package a_DSA_part_11_to_part_20;

import java.util.HashSet;

public class Day14_WhileHashSet {
	public static void main(String[] args) {
		
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		
		
		int i =0;
		while(h1.size()>0) {
			System.out.println(h1);

			if(i == 0) {
				h1.remove(1);
				h1.remove(2);
				i++;

			}else {
				h1.remove(3);
			}
			
		}
		
	}
}
