package collections;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		
		HashSet<String> ab = new HashSet<>();
		
		ab.add("hello");
		ab.add("asd");
		ab.add("dsad");
		ab.add("e3w");
		
		
		System.out.println(ab);
		
		
		ab.remove("e3w");
		System.out.println(ab);

	}
}
