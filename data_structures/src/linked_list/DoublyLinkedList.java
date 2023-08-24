package linked_list;

public class DoublyLinkedList {
	DLNode head, tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void insertReverse(int[] arr) {
		for (int i : arr) {
			DLNode newNode = new DLNode(i);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				head.prev = newNode;
				newNode.next = head;
				head = newNode;
			}
		}
	}

	public void insert(int[] arr) {
		for (int i : arr) {
			DLNode newNode = new DLNode(i);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				newNode.prev = tail;
				tail.next = newNode;
				tail = newNode;
			}
		}
	}

	public void traversal() {
		DLNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void traversalReverse() {
		DLNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}

	public void search(int i) {
		DLNode temp = head;
		while (temp != null) {
			if (temp.data == i) {
				System.out.println("Present");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Not Present");
	}

	public void delete(int i) {
		if (head == null) {
			return;
		}
		if (head.data == i) {
			head = head.next;
			head.prev = null;
			return;
		}

		DLNode prev = head;
		DLNode curr = prev.next;
		DLNode temp = curr.next;
		while (curr != null) {
			if (temp.next == null && temp.data == i) {
				curr.next = null;
				temp.prev = null;
				tail = curr;
				return;
			}
			if (curr.data == i) {
				prev.next = temp;
				temp.prev = prev;
				return;
			}
			prev = prev.next;
			curr = curr.next;
			temp = temp.next;
		}
	}
}

