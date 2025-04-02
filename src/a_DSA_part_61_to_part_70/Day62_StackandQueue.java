package a_DSA_part_61_to_part_70;

import java.util.Stack;

import javax.crypto.Mac;

public class Day62_StackandQueue {
	public static void main(String[] args) {
		Macha m1 = new Macha(22, "Vignes");
		Macha m2 = new Macha(22, "Dinesh");


		//		Adding the values to the stack
		Stack<Macha> st = new Stack<Macha>();
		
		st.push(m1);
		st.push(m2);	
		
		st.pop();
		Macha temp = st.pop();

		System.out.println(temp.age);
	}
}

class Macha{
	int age;
	String name;

	public Macha(int age, String name) {

		age =  this.age;
		name =  this.name;

	}
}
