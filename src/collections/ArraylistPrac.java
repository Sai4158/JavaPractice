package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistPrac {
	public static void main(String[] args) {
		
		//make sure this is integer not int
		Integer[] arr = {34,43,45,34,56,45,654};
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(arr));
		
		for(Integer s  : al1) {
			System.out.println(s +",");
		}
		
		al1.add(34);
		al1.set(0, 111);
		System.out.println(al1);
	}
}
