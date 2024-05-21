package arrayList_Vector_P46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import arrayCreation.Array;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<String> st1 = new ArrayList<>();
		
		// add for the first array list 
		al1.add(0,null);
		al1.add(1);
		al1.add(2);
		al1.add(3);
			
		//add for the second array list 
		st1.add("hello");
		st1.add("324");
		st1.add("ewwww");
		
		//print one 
		System.out.println(al1);
		
		//print the second one 
		System.out.println(st1);
		//will print the index of the string 
		System.out.println(st1.lastIndexOf("ewwww"));
		
		
		
		Integer arr[] = {23,23,3,23,324,34343,43};
		Vector<Integer> v1 =  new Vector<Integer>(Arrays.asList(arr));
		System.out.println(v1);
		System.out.println(v1.lastIndexOf(324));
		
		String[] str= {"3242","32423","4535"};
		Vector<String> v2 = new Vector<String>(Arrays.asList(str));
		System.out.println(v2);
		System.out.println(v2.firstElement() + "" + v2.lastElement());
			
	}
}
