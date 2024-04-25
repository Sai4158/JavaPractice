package arrayList_Vector_P46;

import java.util.Arrays;
import java.util.Vector;

public class List {
	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.add("tom");
		v1.add("ben");
		
		Vector v2 =  new Vector();
		v2.add("ben");
		v2.add("tom");
		
		//Convert to object array and print it out
		Object[] arr = v1.toArray();
		System.out.println(Arrays.toString(arr));
		
	
		//this will print true cuz order doesn't matter 
		System.out.println(v1.containsAll(v2));
		
		
		//this is how you update or replace 
		//this will replace ben at 0 index 
		//with ramesh
		v1.set(0, "ramesh");
		System.out.println(v1);
		
		
		//this print the index of string 
		System.out.println(v1.indexOf("ben"));
		
		//this will print the last and first element
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());

		}
}
