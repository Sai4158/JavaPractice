package stack_p47;

import java.util.Stack;

public class Sprac {
	public static void main(String[] args) {
		
		Stack<String> books = new Stack<>();
		
		//////////////////////////////////////////
		/// All of these are coming the vector /// 
		//////////////////////////////////////////
		
	
		//nothing new from the 
		books.add("red");
		books.add("green");
		//set color black at index 0
		books.add("black");
		
		//set = will update the value at that index
		books.set(0,"hello");
		
		System.out.println(books);

		//clears the list
		books.clear();
		System.out.println(books);
		
		
		
		
	}

}
