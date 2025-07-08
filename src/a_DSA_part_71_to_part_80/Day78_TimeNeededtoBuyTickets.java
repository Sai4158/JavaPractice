package a_DSA_part_71_to_part_80;

import java.util.LinkedList;
import java.util.Queue;

public class Day78_TimeNeededtoBuyTickets {
	
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.add(i); // Add index, not ticket count
        }

        int time = 0;

        while (true) {
            int person = q.poll();     // index of current person
            tickets[person]--;         // person buys 1 ticket
            time++;

            if (tickets[person] == 0 && person == k) {
                return time;
            }

            if (tickets[person] > 0) {
                q.add(person);         // person goes to back of the queue
            }
        }
    }

    public static void main(String[] args) {
        int tickets[] = {2, 3, 2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));  
    }
}
