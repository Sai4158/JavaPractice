package a_DSA_part_81_to_part_90;

import java.lang.classfile.components.ClassPrinter.Node;

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
		Node node2 =  new Node("a");
		
		node1.next =  node2;
	
		
        System.out.println("node1.data = " + node1.data);
        System.out.println("node1.next.data = " + node1.next.data);
	}
}
