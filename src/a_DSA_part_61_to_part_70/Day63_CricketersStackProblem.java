package a_DSA_part_61_to_part_70;

import java.util.Stack;

public class Day63_CricketersStackProblem {

	public static void main(String[] args) {
		
//		Cricketer and there data
		String[] name = {"Vignesh", "Dinesh", "Arjun", "Pavan"};
		int[] runs = {0, 100, 45, 10};
		String[] nickName = {"Boom", "Bam", "Vim", "Vum"};

		Stack<Cricketers> st = new Stack<Cricketers>();

		for (int i = 0; i < name.length; i++) {

			Cricketers c =  new Cricketers(name[i], runs[i], nickName[i]);
			
			st.push(c);
		}
			
		
		while(!st.isEmpty()) {
			
			Cricketers c = st.pop();
			
			System.out.println(c.name + " " + c.runs + " " + c.nickName);
			
		}
	}
}


 class Cricketers {

	String name;
	int runs;
	String nickName;

	public Cricketers(String name, int runs, String nickName) {
		this.name = name;
		this.runs = runs;
		this.nickName = nickName;

	}

}
