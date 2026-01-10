package a_DSA_part_81_to_part_90;

public class Day86_LinkedList_addAtStart {

// Node of singly linked list
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    // Add new node at the start, return new head
    public static Node addAtStart(Node head, String newData) {
        Node newNode = new Node(newData);
        newNode.next = head;  
        return newNode;       
    }

    public static void main(String[] args) {
        Node head = null;               

        head = addAtStart(head, "c");   
        head = addAtStart(head, "b");  
        head = addAtStart(head, "a");   

        // quick print
        Node curr = head;
        
        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;
            
            if(curr != null) {
            	System.out.print(" -> ");
            }
        }
    }
	
}
