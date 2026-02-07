package a_DSA_leetcode;

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {

    class MyQueue {
    	// stack used for pushing (back of queue)
        private Stack<Integer> in;  
        
        // stack used for popping/peeking (front of queue)
        private Stack<Integer> out;  
        
        public MyQueue() {
            in = new Stack<>();      
            out = new Stack<>();     
        }

        public void push(int x) {
            // always push new elements into 'in'
            in.push(x);
        }

        public int pop() {
            // make sure 'out' has the front element on top
            moveIfneeded();
            // remove and return the front of the queue
            return out.pop();
        }

        public int peek() {
            // make sure 'out' has the front element on top
            moveIfneeded();
            // return the front of the queue (do not remove)
            return out.peek();
        }

        public boolean empty() {
            // queue is empty only if both stacks are empty
            return in.isEmpty() && out.isEmpty();
        }

        private void moveIfneeded() {
            // only move when 'out' is empty
            // moving reverses order so oldest element becomes on top of 'out'
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
        }
    }
}
