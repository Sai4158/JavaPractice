package a_DSA_part_31_to_part_40;

import java.util.HashMap;

public class Day30_CheckIfItsAnagrams {
		public static void main(String[] args) {
			
			String a = "abcd";
			String b =  "abcd";
			
//			HashMap to add these values 
			
			HashMap<Character, Integer> hma =  new HashMap<Character, Integer>();
			HashMap<Character, Integer> hmb =  new HashMap<Character, Integer>();

			
			for (int i = 0; i < a.length(); i++) {
//				Get char at index
				char cha =  a.charAt(i);
				
//				put them and count the frequency count
				hma.put(cha, hma.getOrDefault(cha, 0)+1);
				
			}
			
			
			
			for (int i = 0; i < b.length(); i++) {
				char chb =  b.charAt(i);

				hmb.put(chb, hmb.getOrDefault(chb, 0)+1);

			}
			
			
			//checking
			
			for (char key: hma.keySet()) {
				
				int aa = hma.get(key);
				int bb = hmb.get(key);
				
				
				if(aa!= bb) {
					System.out.println(false);
				}else {
					System.out.println(true);
				}
			}
		
		}
}
