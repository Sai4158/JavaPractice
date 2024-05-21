package set_p52;

import java.util.HashSet;
import java.util.Set;

public class Set_Practice {
	public static void main(String[] args) {
		//HashSet 
		Set<String> hs = new HashSet<String>();
		
		//add method
		
		hs.add("hello set");
		hs.add("abc");
		hs.add("1234");
		hs.add("qwerty");
		
		//this will not allow any dupes 
		//this will not print in insertion order
		//then print it out
		System.out.println(hs);
	}
}
