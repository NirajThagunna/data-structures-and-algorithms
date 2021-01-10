package linked_list.singly_linked_list;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

class DeleteGivenKey {
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

	// delete a given key node here, key == data
	public void deleteGivenNode(int key) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be selected
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be selected
		while (temp != null && temp.data != key) {
			prev = temp; // Keep track of previous node
			temp = temp.next; // change to temp.next
		}

		// If key was not present in the linked list
		if (temp == null) {
			return;
		}

		// release the memory/free the memory
		prev.next = temp.next;
	}
}

public class DeletionGivenNode {
	public static void main(String[] args) {
		int MAX, del;
		try {
			DeleteGivenKey list = new DeleteGivenKey();

			System.out.print("How many nodes do you want to store? ");
			MAX = UserIO.readInt();

			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter " + i + " Node element : ");
				int num = UserIO.readInt();
				list.addNode(num);
			}

			System.out.println("\nLinked List Before Deletion : ");
			list.display();

			System.out.print("\nEnter the Node element you want to delete: ");
			del = UserIO.readInt();
			list.deleteGivenNode(del);
			System.out.println("The linked list after deleting a given Node element: ");
			list.display();
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
