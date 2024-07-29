package collections;

import java.util.Stack;

public class Prac_1_Stack {
	public static void main(String[] args) {

		Stack<String> s1 = new Stack<String>();

		s1.add("1");
		s1.add("2");
		s1.add("3");

		
//		meaning this is LIFO - last in first out 
		System.out.println(s1.peek());
		

		
//		this will print out the array of the string, in order
		System.out.println(s1);
		
		
	}
}
