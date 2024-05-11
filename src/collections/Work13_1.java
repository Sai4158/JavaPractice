package collections;

import java.util.Arrays;
import java.util.*;
import java.util.Vector;

public class Work13_1 {
	public static void main(String[] args) {
		Integer arr[] = {234,3,23,23,30,34,22,10, 10};
		ArrayList<Integer> v1 = new ArrayList<Integer>(Arrays.asList(arr));
		
		
		//will print in reverse 
		for (int i = v1.size() - 5; i>0; i--) {
			System.out.print(v1.get(i) + ",");
		}
		
		
	}
}
