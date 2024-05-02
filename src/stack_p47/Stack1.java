package stack_p47;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {

		Stack<String> books = new Stack<>();

		books.add("red");
		books.add("green");
		books.add("black");

		//Peek will only display the LIFO but will not remove any 

		System.out.println("peek: " + books.peek());
		System.out.println(books + "\n");

		//Pop - POP will also remove Last in first out meaning 
		//it will remove the one thats was added in the last 
		System.out.println("pop: " + books.pop());
		System.out.println(books + "\n");
		
		//push - push and add are the same 
		books.push("gray");
		books.add("purple");
		System.out.println(books + "\n");

		//Search VS indexOf
		//search - Search will return the position of the color in stack
		System.out.println(books);
		System.out.println(books.search("red"));
		
		//indexOf -  it will use just the array to get the index
		System.out.println(books.indexOf("red"));
		
		
	}
}
