package collections;

import java.util.ArrayList;
import java.util.Arrays;

//print the sum and average of the elements in the list 

public class Work1 {
	public static void main(String[] args) {
		Integer n[] = {4,5,0,9,8,10};
		ArrayList<Integer> s1 = new ArrayList<>(Arrays.asList(n));
		
		//this is to add the all the numbers
		int sum = 0;
		for (Integer num : s1) {
			sum += num;
		}
		
		// this for the average
		double average  = sum/(double)s1.size();
		
		System.out.println(sum);
		System.out.println(average);
	}
}
