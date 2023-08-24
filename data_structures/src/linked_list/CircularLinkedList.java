package linked_list;

public class CircularLinkedList {
	Node head;
	Node tail;

	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void insert(int[] arr) {
		for (int i : arr) {
			Node newNode = new Node(i);
			if (head == null) {
				head = newNode;
				tail = newNode;
				tail.next = head;
			} else {
				newNode.next = head;
				head = newNode;
				tail.next = head;
			}
		}
	}

	public void insertReverse(int[] arr) {
		for (int i : arr) {
			Node newNode = new Node(i);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = tail.next;
				newNode.next = head;
			}
		}
	}

	public void search(int num) {
		Node temp = head;
		do {
			if (temp.data == num) {
				System.out.println("Present");
				return;
			}
			temp = temp.next;
		} while (temp != head);
		System.out.println("Not present");
	}

	public void traverse() {
		Node temp = head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();

	}

	public void delete(int i) {
		// DELETE FROM BEGINNING
		if (head.data == i) {
			head = head.next;
			tail.next = head;
			return;
		}
		Node prev = head;
		Node temp = head.next;
		do {
			if (temp.data == i) {
				// DELETE FROM END
				if (temp.next == head) {
					tail = prev;
					tail.next = head;
				}
				// DELETE FROM MID
				prev.next = temp.next;
			}
			temp = temp.next;
			prev = prev.next;

		} while (temp != head);
	}
}
