package linked_list.doubly_linked_list;

import basicIO.UserIO;

class DoublyLinkedList {
	// Node - Element
	class Node {
		Node prev;
		int data;
		Node next;

		public Node(int data) {
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}

	// Creating head pointer
	public Node head = null;
	public Node tail = null;

	// Creating a doubly linked list
	public void create() {
		int choice = 1;
		while (choice != 0) {
			System.out.print("\nEnter any number : ");
			int num = UserIO.readInt();
			Node newNode = new Node(num);

			// Checks if DLL is empty or not
			if (head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode; // link current node with newNode - next
				newNode.prev = tail; // link newNode to previous node - prev 
				tail = newNode; // now, newNode will become tail
			}
			System.out.println("Node inserted");
			
			System.out.print("Do you want to continue[(1-Continue)/(0-Exit)]? ");
			choice = UserIO.readInt();
		}
	}

	// Traversing a DLL
	public void display() {
		Node current = head;

		// check if the DLL is empty
		if (current == null || current.next == null) {
			System.out.println("DLL is empty");
		}

		System.out.println("\nDoubly Linked List is: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("\n");
	}
}

public class ImplementationDLL {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		int choice = 0;

		while (choice >= 0) {
			System.out.println("\n*********** Main Menu ************");
			System.out.println("Choose one option from the following list...");
			System.out.println("====================================");
			System.out.println("1. Create a Doubly Linked List\n2. Display\n3. Exit");
			System.out.println("====================================");
			System.out.print("Enter your choice : ");
			choice = UserIO.readInt();

			switch(choice) {
			case 1 :
				dll.create();
				break;
			case 2 :
				dll.display();
				break;
			case 3 :
				System.exit(0);
			default :
				System.out.println("Please enter valid choice....");
			}
		}
	}
}
