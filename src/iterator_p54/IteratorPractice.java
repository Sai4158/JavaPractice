package iterator_p54;

import java.util.ArrayList;
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
		}
	}
}
