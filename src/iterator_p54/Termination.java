package iterator_p54;

import java.util.Enumeration;
import java.util.Vector;

public class Termination {
	public static void main(String[] args) {
		//enumeration - interface 
		//introduced for iterating the legacy collection objects
		
		//vector 
		Vector<String> abc =  new Vector<String>();
		
		abc.add("Sai");
		abc.add("String");
		abc.add("abhi");
		abc.add("pranav");
		
		
		Enumeration<String> e = abc.elements();
		
		//this will return a boolean		
		while(e.hasMoreElements()) {
			//will print the next element
			System.out.println(e.nextElement());

		}
		
	}
}
