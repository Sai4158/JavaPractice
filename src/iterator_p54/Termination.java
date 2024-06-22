package iterator_p54;

import java.util.Enumeration;
import java.util.Vector;

public class Termination {
	public static void main(String[] args) {
		//enumeration - interface 
		//introduced for iterating the legacy collection objects
		
		//vector 
		Vector<String> abc =  new Vector<String>();
		
		//add data to the vector
		abc.add("Sai");
		abc.add("String");
		abc.add("abhi");
		abc.add("pranav");
		
		//load the data to Enumeration from vector
		Enumeration<String> e = abc.elements();
		
		//if while has more element which will print true
		//then it will print the next elements until there is no next element
		
		//this will return a boolean		
		while(e.hasMoreElements()) {
			//will print the next element
			System.out.println(e.nextElement());
		}
		
		
		
	}
}
