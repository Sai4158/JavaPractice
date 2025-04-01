package a_DSA_leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {

	Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);

        for (int i = 0; i < q.size() - 1; i++) {
            int temp = q.poll();
            q.add(temp);
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

}
