package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import arrayCreation.Array;

//this will print only sum of the even numbers
public class Work2 {
	public static void main(String[] args) {
		Integer arr[] = {234,3,23,23,30,34,22,10, 10};
		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(arr));
		
		//this will add the even numbers
		int sum = 0;
		for (int num : arr) {
			if(num % 2 == 0) {
				sum += num;
			}	
		}
		System.out.print(sum);
		
	}
}
