package set_p52;

import java.util.HashSet;
import java.util.Set;

public class Set_Practice {
	public static void main(String[] args) {
		//no order = set
		//HashSet -> HashMap -> Array of nodes (key,pair)
		
		//HashSet 
		Set<String> hs = new HashSet<String>();
		Set<Integer> fgd = new HashSet<Integer>();

		//add strings
		hs.add("hello set");
		hs.add("abc");
		hs.add("1234");
		hs.add("qwerty");

		//add integer
		fgd.add(23);
		fgd.add(34);
		fgd.add(54);
		fgd.add(45);
		fgd.add(76);

		//print the int out 
		System.out.println(fgd);

		//this is how to remove from int
		fgd.remove(76);

		//print the int out 
		System.out.println(fgd);
		
		//using contains you can see if the data is included or not 
		System.out.println(fgd.contains(76));

		
		//printing out using for each loop 
		for(Integer elements:fgd) {
			System.out.println(elements + ",");
		}
		
		
		
		//this will not allow any dupes 
		//this will not print in insertion order
		//then print it out
		System.out.println(hs);
	}
}
