package arrayList_Vector_P46;

import java.util.Arrays;
import java.util.Vector;

import arrayCreation.Array;

public class Vector_2 {
	public static void main(String[] args) {
		
		//u can specify the vector capacity here
		Vector v1 =  new Vector(10);
		
		v1.add("sai");
		v1.add("aafqw");
		v1.add("sf");
		
		System.out.println(v1.capacity());
		
		//print from a Arrays using As list
		Object[] arr = {2,32,4,24};
		Vector v2 =  new Vector(Arrays.asList(arr));
		System.out.println(v2.capacity());
		System.out.println(v2);
	}
}
