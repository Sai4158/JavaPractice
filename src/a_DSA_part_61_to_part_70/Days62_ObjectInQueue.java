package a_DSA_part_61_to_part_70;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Days62_ObjectInQueue {
	
	public static void main(String[] args) {
		Macha m1 = new Macha(22, "Vignes");
		Macha m2 = new Macha(22, "Dinesh");


		//		Adding the values to the stack
		Queue<Macha> st = new LinkedList<>();
		
		st.add(m1);
		st.add(m2);	
		
		st.poll();
		Macha temp = st.poll();

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
