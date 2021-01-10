package linked_list.singly_linked_list;

class InsertNodeAfterGivenNode {
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

	// Inserting a node after a given node or at middle
	public void insertNodeAfterGivenNode(Node prev_node, int data) {
		// 1. Check if the given node(previous node) is null
		if (prev_node == null) {
			System.out.println("The previous node can't be null.");
			return;
		}

		// 2. Allocate the Node &  
		// 3. Put in the data
		Node newNode = new Node(data);

		// 4. Make next of newNode as next of prev_node
		newNode.next = prev_node.next;

		// 5. Make next of prev_node as newNode
		prev_node.next = newNode;
	}

	public void insertAtSpecifiedPos(int pos, int data){  
		// Create a new node  
		Node newNode = new Node(data);  

		// Checks if the list is empty  
		if(head == null) {  
			//If list is empty, both head and tail would point to new node  
			head = newNode;  
			tail = newNode;  
		}  
		else {  
			Node temp, current;  
			
			// Store the position of the list  
			int count = pos;
			
			// Node temp will point to head  
			temp = head;  
			current = null;  

			// Traverse through the list till the position of the list is reached  
			for (int i = 1; i < count; i++) {  
				// Node current will point to temp  
				current = temp;  
				// Node temp will point to node next to it.  
				temp = temp.next;  
			}  

			// current will point to new node  
			current.next = newNode;
			
			// new node will point to temp  
			newNode.next = temp;  
		}    
	}  
}

public class InsertionAfterNode {
	public static void main(String[] args) {
		// Start with empty list
		InsertNodeAfterGivenNode list = new InsertNodeAfterGivenNode();

		// Inserting a nodes
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);

		System.out.println("Linked List Before Inserting a new node : ");
		list.display();

		// list.insertNodeAfterGivenNode(list.head.next, 100);
		list.insertAtSpecifiedPos(4, 100);
		System.out.println("Linked List After Inserting a new node at specified position : ");
		list.display();
	}
}

// Time complexity of insertNodeAfterGivenNode() is O(1) as it does constant amount of work.
