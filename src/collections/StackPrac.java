package collections;

import java.util.Stack;

public class StackPrac {
	public static void main(String[] args) {
		
		Stack<Integer> s1 =  new Stack<Integer>();
		
		//stack is lifo -  last in first out
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		
		System.out.println(s1.peek());
		
		//pop will remove top int
		s1.pop();
		
		//peek will print the a top num
		System.out.println(s1.peek());

		System.out.println("---");
		//will print as it is 
		System.out.println(s1);
		
		s1.clear();
 	}
}
