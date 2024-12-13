package a_DSA_part_31_to_part_40;

import java.util.HashMap;

public class Day30HashMapCount {	
	public static void main(String[] args) {
		
		String a = "heloffdegjkljkrngjnerjn";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < a.length(); i++) {
			
			char ch = a.charAt(i);
			
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		
		for (Character key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }

	
	}
}
