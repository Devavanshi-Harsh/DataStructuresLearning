package linked_list;

public class SinglyLinkedList {
	Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public void insert(int[] arr) {
		Node temp = head;
		for (int i : arr) {
			Node node = new Node(i);
			if (temp == null) {
				temp = node;
				head = temp;
			} else {
				temp.next = node;
				temp = temp.next;
			}
		}

	}

	public Node insertReverse(int[] arr) {
		for (int i : arr) {
			Node node = new Node(i);
			if (head == null) {
				head = node;
			} else {
				node.next = head;
				head = node;

			}
		}
		return head;
	}

	public boolean search(int data) {
		Node node = head;
		while (node != null) {
			if (node.data == data)
				return true;
			node = node.next;
		}
		return false;
	}

	public void delete(int data) {
		Node prev = head;
		Node curr = prev.next;
		while (curr != null) {
			if (curr.data == data) {
				prev.next = curr.next;
				break;
			}
			prev = curr;
			curr = curr.next;
		}
	}

	public void traversal() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public void traversal(Node temp) {
		Node node = temp;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public void removeNthFromEnd(int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		if (head == null) {
		}
		if (head.next == null) {
			head = head.next;
		}
		Node slow = dummy, fast = dummy;

		// Move fast pointer n nodes ahead
		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}
		// Move both pointers until fast reaches the end
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		// Remove the nth node from the end
		slow.next = slow.next.next;
		head = dummy.next;
	}

	public void reverse() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
	}
}
