package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//this will split into lists 
//using the sublist 

public class Work4 {
	public static void main(String[] args) {
		Integer arr[] = {11,2,22,11,30,11,2,2, 1};
		LinkedList<Integer> s1 = new LinkedList<Integer>(Arrays.asList(arr));
		
		//split using the sublist
		//from index to index
		List<Integer> Split1 =  s1.subList(0,4);
		List<Integer> Split2 =  s1.subList(4,8);

		
		System.out.println(Split1);
		System.out.println(Split2);
	}
}
