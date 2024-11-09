package a_DSA_part_21_to_part_30;

import java.util.ArrayList;

import arrayList_Vector_P46.Arraylist;

public class Day17_ArrayList_toeplitz {
		public static void main(String[] args) {
			
			ArrayList<ArrayList<Integer>> s1 = new ArrayList<ArrayList<Integer>>();
			
			int fin = 5;
			
			for (int i = 0; i < fin; i++) {
				ArrayList<Integer>s2 = new ArrayList<Integer>();
				
				for (int j = 0; j <= i; j++) {
					
					if(j==0||j==i) {
						s2.add(1);
					}else{
						s2.add(s1.get(i-1).get(j-1) + s1.get(i-1).get(j));
					}
				}
				
				s1.add(s2);
			}
			System.out.println(s1);
		}
}
