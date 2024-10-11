package a_DSA_part_11_to_part_20;

import java.util.HashMap;

public class Day11_HashMap_int_string {
	public static void main(String[] args) {
		
		HashMap<String, Integer> nav = new HashMap< >();
		
		nav.put("Chicken", 3);
		nav.put("celsuis", 2);
		nav.put("fruit", 0);
		nav.put("oil", 0);
		

		System.out.println(nav);
		
		if(!nav.containsKey("mayo")) {
		 nav.put("mayo", 100);
		}
		System.out.println(nav);

		
//		Print all the keys
		System.out.println(nav.keySet());
		
//		print all the values
		System.out.println(nav.values());
	}
}
