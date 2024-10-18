package a_DSA_part_11_to_part_20;

import java.util.HashMap;
import java.util.Stack;

public class Day12_HashMap1 {
	public static void main(String[] args) {
		
		
		HashMap<Integer, Integer> s1 =  new HashMap<Integer, Integer>();
		int arr[] = {4,4,56,34,56,4,4};

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			
			if(s1.containsKey(n)) {
				int prev = s1.get(n);
				s1.put(n, prev + 1);
			}else {
				s1.put(n, 1);
			}
		}
		
		
//		Printing 
		for(int s : s1.keySet()) {
			System.out.println(s + " " + s1.get(s));
		}
	}
}
