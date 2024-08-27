package ist_prac;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		
		//this is array list 
		ArrayList<String> abc = new ArrayList<String>();
		
		abc.add("Sai");
		abc.add("Pranav");
		
		
		for (int i = 0; i < abc.size(); i++) {
			System.out.println(abc.get(i));
		}
	}
}
