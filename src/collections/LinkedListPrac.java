package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPrac {
	public static void main(String[] args) {
		
		String s[] = {"ap","ts","cs","cm"};
		
		LinkedList<String> s1 = new LinkedList<String>(Arrays.asList(s));
 		
		System.out.println(s1);
		
		s1.set(0, "9999");
		s1.add("1111");
		
		for(String s3: s1) {
			System.out.println(s3);
		}
	}
}
