package a_DSA_part_81_to_part_90;

public class Day85_LinkedList {

	    // Simple singly linked list node
	    static class Node {
	        String data;
	        Node next;

	        Node(String data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Add a new node at the start of the list and return the new head
	    public static Node addAtStart(Node head, String newData) {
	        Node newNode = new Node(newData);

	        newNode.next = head;  // point new node to current head
	        head = newNode;       // move head to new node

	        return head;          // return updated head
	    }

	    // Helper: print the linked list
	    public static void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {

	        Node head = null;            // start with empty list

	        head = addAtStart(head, "c");
	        head = addAtStart(head, "b");
	        head = addAtStart(head, "a");

	        // List should be: a -> b -> c -> null
	        printList(head);
	    }
	}




