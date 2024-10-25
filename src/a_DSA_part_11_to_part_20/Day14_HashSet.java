package a_DSA_part_11_to_part_20;

import java.util.HashSet;

public class Day14_HashSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs =  new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		hs.remove(3);
		
		if(hs.contains(2)) {
			System.out.println("Yes");
		}
		
		
		System.out.println(hs.size());
		System.out.println(hs);
	}
}
