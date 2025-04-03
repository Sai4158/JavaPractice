package a_DSA_part_61_to_part_70;

import java.util.Deque;
import java.util.LinkedList;

public class Day64_PlayersUsingDeque {
	
	public static void main(String[] args) {
		
	    String[] name = {"Vignesh", "Dinesh", "Arjun", "Pavan"};
        int[] age = {0, 100, 45, 10};
        String[] flag = {"red", "yellow", "blue", "green"};

		
		Deque<user> dq = new LinkedList<user>();
		
		
		for (int i = 0; i < name.length; i++) {
			
			dq.add(new user(name[i], age[i], flag[i]));
		}
		
		
		
		while(!dq.isEmpty()) {
			
			user back =  dq.poll();
			
			System.out.println(back.name + " " + back.age + " " + back.flag +  " ");
		}
	}
}


class user {
	
	
	String name;
	int age;
	String flag;
	
	
	public user(String name, int age, String flag) {

		this.name = name;
		this.age =  age;
		this.flag =  flag;
	}
	
}
