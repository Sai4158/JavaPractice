package a_DSA_part_31_to_part_40;

import java.util.HashMap;

public class Day30_ComparingValuesInHashMap {
	
	public static void fun(HashMap <Integer,Integer> hm) {
		
		System.out.println(hm);
		System.out.println(hm.get(3));
		
//		This is comparing the values it and should print 6
		System.out.println(hm.get(5) == hm.get(6));
	}
	
	
	
	public static void main(String[] args) {
		HashMap <Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(1, 3);
		hm.put(3, 2);
		hm.put(5, 5);
		hm.put(6, 5);
		
		
		fun(hm);
	}
}
