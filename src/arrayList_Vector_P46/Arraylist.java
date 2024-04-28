package arrayList_Vector_P46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import arrayCreation.Array;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(0,null);
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
		
		System.out.println(al1);
		
		Integer arr[] = {23,23,3,23,324,34343,43};
		Vector<Integer> v1 =  new Vector<Integer>(Arrays.asList(arr));
		System.out.println(v1);
		System.out.println(v1.lastIndexOf(324));
		
		String[] str= {"3242","32423","4535"};
		Vector<String> v2 = new Vector<String>(Arrays.asList(str));
		System.out.println(v2);
			
	}
}
