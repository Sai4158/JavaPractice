package collections;

import java.util.Arrays;
import java.util.*;
import java.util.Vector;

public class Work13_1 {
	public static void main(String[] args) {
		Integer arr[] = {234,3,23,23,30,34,22,10, 10};
		Integer arr1[] = {123,345,23453,23,33450,453,345,345, 34,11};

		ArrayList<Integer> v1 = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> v2 = new ArrayList<Integer>(Arrays.asList(arr1));

	
		
		//Prints in reverse and removes first 5 elements
		for (int i = v1.size() - 5; i>0; i--) {
			System.out.print(v1.get(i) + ",");
		}
		
		System.out.println();
		
		//this is how to combine arrays in vector using
		// add all 
		v1.addAll(v2);
		System.out.print(v1);
		
		//Will remove the 
		v1.removeAll(v2);
		
		
		
	}
}
