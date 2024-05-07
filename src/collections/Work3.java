package collections;

import java.util.*;


//this will print the sum of the odd number

public class Work3 {
	public static void main(String[] args) {
		Integer arr[] = {11,2,22,11,30,11,2,2, 1};
		LinkedList<Integer> s1 = new LinkedList<Integer>(Arrays.asList(arr));
			
		
		int sum = 0;
			for(int num:s1) {
				
				if(num % 2 != 0) {
					
					//+= will add the odd numbers
					sum += num;
				}
			}
			System.out.print(sum);
	}
}
