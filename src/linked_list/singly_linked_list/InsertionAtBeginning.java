package linked_list.singly_linked_list;

class InsertAtStart {
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
	
	// Adding Nodes
	public void addNode(int data) {
		Node node = new Node(data);
		
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
	}
	
	// Displaying all the nodes of a list
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
	
	// add node at start/front
	public void insertAtStart(int data) {
		// 1 - Allocate the Node
		// 2 - Put in the data
		Node newNode = new Node(data);
		
		// Check if the list is empty
		if (head == null) {
			// If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		}
		else {
			Node temp = head; // Node temp will point to head
			head = newNode; // newNode will become new head of the list
			head.next = temp; // Node temp(previous head) will be added after new head
		}
	}
}

public class InsertionAtBeginning {
	public static void main(String[] args) {
		InsertAtStart list = new InsertAtStart();
		
		// Adding nodes
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		
		// Displaying all the nodes
		System.out.println("Nodes Before Inserting new node : ");
		list.display();
		
		list.insertAtStart(50);
		System.out.println("Nodes After Inserting new node : ");
		list.display();
	}
}

// Time complexity of insertAtStart() is O(1) as it does constant amount of work.
// Time Complexity : O(1)