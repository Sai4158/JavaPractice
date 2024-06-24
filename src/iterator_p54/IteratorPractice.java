package iterator_p54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import arrayList_Vector_P46.Arraylist;

public class IteratorPractice {
	public static void main(String[] args) {
		
		//iterator is for new classes 
		// legacy classes
		
		ArrayList<Integer>  abc = new ArrayList<Integer>();
		
		abc.add(5);
		abc.add(10);
		abc.add(15);
		
		System.out.println(abc);
		
		//this is how to make a iterator 
		Iterator<Integer> al = abc.iterator();
		
		
		//using while loop print 
		while(al.hasNext()) {
			System.out.println(al.next());
			al.remove();
			
		}
		
		//you cannot use iterator when using a map function 
		HashMap<String, Integer> s1  = new HashMap<String, Integer>();
		
		s1.put("India", 500);
		s1.put("efew", 700);
		s1.put("rgr", 300);
		
		//this is how you apply iterator since it doesn't not apply directly 
		s1.keySet().iterator();
		s1.values().iterator();

	}
}
