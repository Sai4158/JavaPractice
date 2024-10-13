package a_DSA_part_11_to_part_20;

import java.util.HashMap;
import java.util.Iterator;

public class Day12_frequency_count_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		String arr[] = {"hello", "hello","tata", "hi", "tata"};
		 
		
//		For loop 
		for (int i = 0; i < arr.length; i++) {
			
			String key =  arr[i];
			
			if(h.containsKey(key)) {
				int currentval = h.get(key);
				h.put(key,currentval+1);
			}else {
				h.put(key, 1);
			}
			
		}
		
//		Print 
		for(String s  :h.keySet()) {
			System.out.println(s + " " + h.get(s));
		}
	}
}
