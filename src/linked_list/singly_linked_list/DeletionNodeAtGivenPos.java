package linked_list.singly_linked_list;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

class DeleteAtGivenPos {
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
	
	// delete a node at specified position
	public void deleteNodeAtPos(int pos) {
		// Check if the list is empty
		if (head == null) {
			return;
		}
		
		Node temp = head;
		
		// If the element is present at first Node or position
		if (pos == 0) {
			head = temp.next;
			return;
		}
		
		// Traverse the linked list
		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < pos - 1; i++) {
			temp = temp.next;
		}
		
		// If the pos is greater than the number of nodes
		if (temp == null || temp.next == null) {
			return;
		}
		
		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Node next = temp.next.next;
		
		// Unlink the deleted node from list
		temp.next = next;
	}
}

public class DeletionNodeAtGivenPos {
	public static void main(String[] args) {
		int MAX, pos;
		try {
			DeleteAtGivenPos list = new DeleteAtGivenPos();

			System.out.print("How many nodes do you want to store? ");
			MAX = UserIO.readInt();

			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter " + i + " Node element : ");
				int num = UserIO.readInt();
				list.addNode(num);
			}

			System.out.println("\nLinked List Before Deletion : ");
			list.display();

			System.out.print("\nEnter the position of element you want to delete: ");
			pos = UserIO.readInt();
			list.deleteNodeAtPos(pos);
			System.out.println("The linked list after deleting a Node at specified position is: ");
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
