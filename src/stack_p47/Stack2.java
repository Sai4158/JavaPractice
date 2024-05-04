package stack_p47;

import java.util.Stack;

public class Stack2 {
	public static void main(String[] args) {
		
		Stack<String> S1 = new Stack<>();
		
		S1.add("color1");
		S1.push("color2");
		S1.push("color3");
		
		System.out.println("\n"+S1);
		
		//will remove the last element 
		S1.pop();
		
		System.out.println("\n"+S1);
		
		S1.add("color4");
		S1.add("color5");
		S1.add("color6");
		
		//will print the top item in the stack
		System.out.println(S1.peek());
		
		System.out.println(S1);
	}
}
