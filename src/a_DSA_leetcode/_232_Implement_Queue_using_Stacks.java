package a_DSA_leetcode;

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {

	class MyQueue {

		private Stack<Integer> in;
		private Stack<Integer> out;

		public MyQueue() {
			in =  new Stack<>();
			out =  new Stack<>();
		}

		public void push(int x) {

			in.push(x);

		}

		public int pop() {

			moveIfneeded();
			return out.pop();

		}


		public int peek() {

			moveIfneeded();
			return out.peek();


		}

		public boolean empty() {
			return in.empty() && out.isEmpty();
		}


		private void moveIfneeded() {

			if (out.isEmpty()) {
				while (!in.isEmpty()) {
					out.push(in.pop());
				}
			}

		}
	}
}
