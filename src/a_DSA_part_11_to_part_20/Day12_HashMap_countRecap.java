package a_DSA_part_11_to_part_20;

import java.net.SecureCacheResponse;
import java.util.Currency;
import java.util.HashMap;

public class Day12_HashMap_countRecap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> abc =  new HashMap<>();
		
		String arr[] = {"hy","hu","hi","hi","hu", "hi","hi"};
		
		
		for (int i = 0; i < arr.length; i++) {
			String key = arr[i];
			
			if(abc.containsKey(key)) {
				int current = abc.get(key);
				abc.put(key, current+1);
			}else {
				abc.put(key, 1 );
			}
		}
		
		
//		Print for each 
		for (String s : abc.keySet()) {
			System.out.println(s + " " + abc.get(s));
		}
		
	}
}
