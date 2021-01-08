package linked_list.singly_linked_list;

class InsertAtEnd {
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
	
	// Add Node
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
	
	// Displaying all the nodes
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
	
	// Inserting a new node at end/last
	public void insertAtEnd(int data) {
		
		/*
		   1. Allocate the Node & 
           2. Put in the data 
		 */
		Node newNode = new Node(data);
		
		// 3. If the Linked List is empty, then make the newNode as head and tail
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		
		// 4. This newNode is going to be the last node, so make next of newNode as null
		newNode.next = null;
		
		// 5. Else traverse till the last node
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		
		// 6. Change the next of last node - last node of previous list - link between previous node to newNode
		temp.next = newNode; // newNode will be added after temp(previous last node) such that temp's next will point to newNode
		tail = temp;
		tail = newNode; // newNode will become new tail of the list
	}
}
public class InsertionAtEnd {
	public static void main(String[] args) {
		// Start with empty list
		InsertAtEnd list = new InsertAtEnd();
		
		// Inserting a nodes
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		
		System.out.println("Linked List Before Inserting a new node : ");
		list.display();
		
		list.insertAtEnd(100);
		System.out.println("Linked List After Inserting a new node : ");
		list.display();
	}
}

// Time complexity of insertAtEnd() is O(n) where n is the number of nodes in linked list. Since there is a loop from head
// to end, the function does O(n) work. This method can also be optimized to work in O(1) by keeping an extra pointer to 
// tail of linked list.
// Time Complexity to insert a node at the end is : O(n)