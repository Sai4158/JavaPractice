package a_DSA_leetcode;

import java.util.Stack;

public class _682_Baseball_Game {

	public static int calPoints(String[] operations) {

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < operations.length; i++) {

			String val = operations[i];

			if (val.equals("+")) {

				int to = st.pop();
				int to2 = st.peek();
				st.push(to); 
				st.push(to + to2);
			}

			else if (val.equals("D")) {
				int to = st.peek();
				st.push(to * 2);
			}

			else if (val.equals("C")) { 
				st.pop();
			}

			else {
				st.push(Integer.valueOf(val));
			}
		}

		int ans = 0;

		for (int i : st) {
			ans += i;
		}
		return ans;
	}

	public static void main(String[] args) {
		String[] ops1 = {"5", "2", "C", "D", "+"};
		System.out.println(calPoints(ops1));  
	}
}
