package linked_list.singly_linked_list;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

class ReverseList {
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
	public void display(Node node) {

		if (node == null) {
			System.out.println("List is empty.");
			return;
		}

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	// Function to reverse the linked list
	// Passing head
	public Node reverseList(Node node) {
		// Initialize three pointers prev as NULL, curr as head and next as NULL
		Node prev = null;
		Node current = node;
		Node next = null;

		// Iterate through the linked list
		while (current != null) {
			// Before changing next of current, store next node
			next = current.next;

			// Now change next of current, this is where actual reversing happens
			current.next = prev;

			// Move prev and current one step forward
			prev = current;
			current = next;
		}

		// Make head as the prev node
		node = prev;
		return node;
	}
}

public class ReverseIterative {
	public static void main(String[] args) {
		int MAX;
		try {
			ReverseList list = new ReverseList();

			System.out.print("How many nodes do you want to store? ");
			MAX = UserIO.readInt();

			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter " + i + " Node element : ");
				int num = UserIO.readInt();
				list.addNode(num);
			}

			System.out.println("\nLinked List: ");
			list.display(list.head);

			System.out.println("\nReversed linked list is: ");
			list.head = list.reverseList(list.head);
			list.display(list.head);
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
