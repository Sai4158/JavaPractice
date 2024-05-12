package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {

		Integer arr[] = {23,23,323,234,342,543};

		LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(arr));

		//printing even numbers only

		for(Integer s: l1) {
			if(s % 2 ==0) {
				System.out.print(s + ","); 
			}
		}


		System.out.println();


		//print the even number and add it 
		int sum = 0;
		for(Integer n: l1) {
			if(n%2==0) {
				sum += n;
			}
		}
		//make sure to print it out of the loop
		System.out.print(sum);

	}
}
