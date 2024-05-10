package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Work13 {
	public static void main(String[] args) {
		Integer arr[] = {234,3,23,23,30,34,22,10, 10};
		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(arr));
		
		//will print it 
		for (int i = 0; i < v1.size(); i++) {
			System.out.print(v1.get(i) + ",");
		}
		System.out.println();
		//will print in reverse
		for (int i = v1.size() - 1; i>0; i--) {
			System.out.print(v1.get(i)+ ",");
		}
	
	}
}
