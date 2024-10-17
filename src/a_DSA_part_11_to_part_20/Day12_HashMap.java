package a_DSA_part_11_to_part_20;

import java.util.HashMap;

public class Day12_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> s1 =  new HashMap<Integer, Integer>();
		
		int arr[] = {4,5,6,34,6,3,5};
		
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			
			s1.put(n, 1);
		}
		
		
//		Printing 
		for(int s : s1.keySet()) {
			System.out.println(s + " " + s1.get(s));
		}
	}
}
