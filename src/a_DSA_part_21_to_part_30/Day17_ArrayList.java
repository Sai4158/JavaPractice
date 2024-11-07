package a_DSA_part_21_to_part_30;

import java.util.ArrayList;

public class Day17_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(78);
		arr.add(456);
		arr.add(65);
		arr.add(98);
		
		
		
		System.out.println(arr);
		
		
		
		arr.remove(98);
		System.out.println(arr);
		
		
		
		arr.addFirst(43);
		System.out.println(arr);
		
		
		arr.lastIndexOf(34);
		System.out.println(arr);
		
		
		
	}
}
