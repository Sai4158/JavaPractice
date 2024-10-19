package a_DSA_part_11_to_part_20;

import java.util.HashMap;
import java.util.Stack;

public class Day12_HashMap_jewelsAndStones {
	public static void main(String[] args) {
		
//		Will count if jewels and stones contains same chars 
		
		String jewels = "aadbsbbxa";
		String stones = "aadbsbbxa";
		
		
		HashMap<Character, Integer> Hash =  new HashMap<>();
		
		int count = 0;
		
		for (int i = 0; i < stones.length(); i++) {
			char a =  stones.charAt(i);
			Hash.put(a, Hash.getOrDefault(a, 0)+1);
		}
		
		for (int i = 0; i < jewels.length(); i++) {
			char a =  jewels.charAt(i);
			if(Hash.containsKey(a)) {
				count += Hash.get(a);
			}
		}
		
		
//		This is for printing 
		for (Character s : Hash.keySet()) {
			System.out.println(s + " " + Hash.get(s));
		}
	}
}
