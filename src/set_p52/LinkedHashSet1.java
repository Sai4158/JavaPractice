package set_p52;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		
		//LinkedHashSet -> LinkedHashMap -> link of nodes (key,pair)
		
		//the difference is here it will print in insertion order
		//HashSet doesn't print in the order  
		
		//LinkedHashSet 
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
	

		//add strings
		hs.add("hello set");
		hs.add("abc");
		hs.add("1234");
		hs.add("qwerty");

		//then print it out
		System.out.println(hs);
		
		//printing using the for each loop 
		for(String s : hs) {
			System.out.println(hs);
		}
		
		//[hello set, abc, 1234, qwerty]

	}
}
