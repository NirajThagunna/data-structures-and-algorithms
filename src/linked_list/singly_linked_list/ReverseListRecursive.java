package linked_list.singly_linked_list;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

class ReverseLinkedList {
	// Node - Element
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	// add node
	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// display Node
	public void display() {
		Node current = head;

		if (current == null) {
			System.out.println("List is empty.");
			return;
		}

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	// Reversing a linked list - recursive method
	// This method checks whether node next to current is null which implies that, current is pointing to tail, then it will
	// print the data of the tail node.
	// Recursively call reverse() by considering node next to current node and prints out all the nodes in reverse order 
	// starting from the tail.
	public void reverse(Node current) {
		// check if the list is empty
		if (head == null || head.next == null) {
			System.out.println("List is empty.");
			return;
		}
		else {
			// Checks if the next node is null, if yes then print
			if (current.next == null) {
				System.out.print(current.data + " ");
				return;
			}
			// Recursively calls the recursive function
			reverse(current.next);
			System.out.print(current.data + " ");
		}
	}
}

public class ReverseListRecursive {
	public static void main(String[] args) {
		int MAX;
		try {
			ReverseLinkedList list = new ReverseLinkedList();

			System.out.print("How many nodes do you want to store? ");
			MAX = UserIO.readInt();

			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter " + i + " Node element : ");
				int num = UserIO.readInt();
				list.addNode(num);
			}

			System.out.println("\nLinked List: ");
			list.display();
			
			System.out.println("\nReversed linked list is: ");
			list.reverse(list.head);
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw =  new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}

// Time Complexity: O(n) 
// Space Complexity: O(1)
