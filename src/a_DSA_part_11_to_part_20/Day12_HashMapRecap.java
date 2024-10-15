package a_DSA_part_11_to_part_20;

import java.util.HashMap;

public class Day12_HashMapRecap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> abc =  new HashMap<>();

		String arr[] = {"Sai","Sai","ABHI","Pranav","PRANAV"};
		
		
		for (int i = 0; i < arr.length; i++) {
			String key = arr[i];
			abc.put(key, abc.getOrDefault(key, 0)+1);
		}
		
		
		for (String s : abc.keySet()) {
			System.out.println(s + " " + abc.get(s));
		}
	}
}

//PRANAV 1
//Pranav 1
//Sai 2
//ABHI 1