package a_DSA_part_21_to_part_30;

import java.util.ArrayList;

public class Day17_ArrayList_Of_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> s1 = new ArrayList<>();
		
		
//		Nested Array list 
		ArrayList<Integer> s2 = new ArrayList<>();
		s2.add(345);
		s2.add(678);
		s2.add(980);

		
//		Nested Array list 
		ArrayList<Integer> s3 = new ArrayList<>();
		s3.add(2);
		s3.add(3);
		s3.add(4);
		
		
		
//		Add to the main arrayList
		
		s1.add(s2);
		s1.add(s3);
		
		
//		Now print 
		System.out.println(s1);
//		[[345, 678, 980], [2, 3, 4]]
	}
}	
