package a_DSA_part_11_to_part_20;

import java.util.HashMap;

public class Day12_HashMap_getOrDefault {
	public static void main(String[] args) {
		
//		HashMap
		HashMap<String, Integer> abc =  new HashMap<>();

//		Array of Strings
		String arr[] = {"hy","hu","hi","hi","hu", "hi","hi","Sai"};
		
		
//		Add arr to the Hashmap
		for (int i = 0; i < arr.length; i++) {
			String key  = arr[i];
			
//			if it find a dupe then + 1
			abc.put(key, abc.getOrDefault(key, 0)+1);
			
		}
		
//		For each printing
		for (String s : abc.keySet()) {
//			Get the values 
			System.out.println(s + " " + abc.get(s));
		} 
	}
}
