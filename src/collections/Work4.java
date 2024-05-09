package collections;

import java.util.Arrays;
import java.util.LinkedList;

//this will split into lists 
public class Work4 {
	public static void main(String[] args) {
		Integer arr[] = {11,2,22,11,30,11,2,2, 1};
		LinkedList<Integer> s1 = new LinkedList<Integer>(Arrays.asList(arr));

		//First the split array based on the size
		int split = s1.size()/2;
		
		//then split into 2 
		LinkedList<Integer> Split1 =  new LinkedList<Integer>(s1.subList(0,split));
		LinkedList<Integer> Split2 =  new LinkedList<Integer>(s1.subList(split, s1.size()));
		
		System.out.println(Split1);
		System.out.println(Split2);
	}
}
