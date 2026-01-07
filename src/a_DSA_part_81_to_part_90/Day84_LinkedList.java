package a_DSA_part_81_to_part_90;

public class Day84_LinkedList {

	
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

	
	public static void main(String[] args) {
		
		Node node1 =  new Node("a");
		Node node2 =  new Node("b");
		
		node1.next =  node2;
	
		
        System.out.println("node1.data = " + node1.data);
        System.out.println("node1.next.data = " + node1.next.data);
        
        
        Node node3 =  new Node("c");
        Node node4 =  new Node("d");
        
        node2.next =  node3;
        
        System.out.println(node2.next.data);
        
        Node head = node1;
        Node temp =  head;
        
        while(temp != null) {
        	
        	System.out.print(temp.data);
                	
        	temp =  temp.next;

        	if(temp != null) {
        		System.out.print(" -> ");
        	}
        	
        }
	}
	
	
}
