package a_DSA_part_11_to_part_20;

import java.util.HashMap;
import java.util.Set;

public class Day12_getOrDefault {
	public static void main(String[] args) {
		
//		Hashmap 
		HashMap<Integer, Integer> hash =  new HashMap<Integer, Integer>();
		
		int arr[] = {3,4,5566,2,2,56,3,66,34,2,1,1,3,4,5};
		
		
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			
			hash.put(a, hash.getOrDefault(a, 0)+1);
		}
		
//		Printing 
		
		for(Integer s : hash.keySet()) {
			System.out.println(s + " " + hash.get(s));
		}
	}
}
