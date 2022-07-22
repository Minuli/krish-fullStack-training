

//reverse linked list algorithm

class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}


	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
            System.out.print(next);
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}


	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(05);
		list.head.next = new Node(19);
		list.head.next.next = new Node(87);
		list.head.next.next.next = new Node(31);

		System.out.println("-----------------Linked list-----------------");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("-----------------Reversed Linked List---------------");
		list.printList(head);
	}
}


