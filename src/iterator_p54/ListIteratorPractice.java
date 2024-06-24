package iterator_p54;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorPractice {
	public static void main(String[] args) {

		ArrayList<Integer>  al = new ArrayList<Integer>();

		al.add(5);
		al.add(10);
		al.add(15);


		//this is how to make a list iterator 
		ListIterator<Integer> Lit = al.listIterator();
		Lit.add(23);


		//using while loop print 
		while(Lit.hasNext()) {
			System.out.println(Lit.next());

		}

	
	}
}
