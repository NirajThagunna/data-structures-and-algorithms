package linked_list.singly_linked_list;

import java.io.PrintWriter;
import java.io.StringWriter;

class SinglyLinkedList {
	
	// Creating a class Node of a singly linked list
	class Node {
		int data;
		Node next; // Next is a pointer to the next node
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// Creating the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;
	
	// addNode() will add new node to the list
	public void addNode(int data) {
		// Creating a new Node
		Node newNode = new Node(data);
		
		// Checking if the list is empty
		if (head == null) {
			// if list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		}
		else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode; // link to the new node
			
			// newNode will become new tail of the list
			tail = newNode;
		}
	}
	
	// display() will display all the nodes present in the list
	public void display() {
		// Define a Node current which initially points to the head of the list
		// Node current will point to head 
		Node current = head;
		
		if (current == null) {
			System.out.println("List is empty");
			return;
		}
		
		System.out.println("Nodes of singly linked list are: ");
		while (current != null) {
			// Prints each node by incrementing pointer - increment current variable
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class Traversing {
	public static void main(String[] args) {
		try {
			SinglyLinkedList list = new SinglyLinkedList();
			
			// Adding nodes to the list
			list.addNode(2);
			list.addNode(4);
			list.addNode(10);
			list.addNode(20);
			
			// Displays the nodes present in the list
			list.display();
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}

// Time Complexity : O(n)