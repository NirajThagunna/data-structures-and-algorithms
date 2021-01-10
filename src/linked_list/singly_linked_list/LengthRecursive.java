package linked_list.singly_linked_list;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

class ListLength {
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

	// find length - Returns count of nodes in linked list
	public int getCountRec(Node node) {
		
		if (node == null) {
			return 0;
		}
		
		// Count is this node plus rest of the list
		return (1 + getCountRec(node.next));
	}
	
	// Wrapper over getCountRec()
	public int getCount() {
		return getCountRec(head);
	}
}

public class LengthRecursive {
	public static void main(String[] args) {
		int MAX;
		try {
			ListLength list = new ListLength();

			System.out.print("How many nodes do you want to store? ");
			MAX = UserIO.readInt();

			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter " + i + " Node element : ");
				int num = UserIO.readInt();
				list.addNode(num);
			}

			System.out.println("\nLinked List: ");
			list.display();

			int size = list.getCount();
			System.out.println("\nThe size of the linked list is: " + size);
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
