package linked_list;

import java.util.LinkedList;

public class LeetCodeQuestions {
	public static SinglyLinkedList multiplyLinkedLists(Node l1, Node l2) {
		int data1 = 0;
		int data2 = 0;
		int counter = 1;
		while (l1 != null) {
			data1 += l1.data;
			l1 = l1.next;
			if (l1 != null) {
				data1 *= 10;
			}
		}
		while (l2 != null) {
			data2 += l2.data;
			l2 = l2.next;
			if (l2 != null) {
				data2 *= 10;
			}
		}
		int n = data1 * data2;
		String mult = "" + n;
		String[] strArr = mult.split("");
		int[] arr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(arr);
		return list;

	}

	public static Node insert(Node node) {

		Node head = null;
		while (node != null) {
			Node newNode = new Node(node.data);
			node = node.next;
			if (head == null) {
				head = newNode;
			} else {
				newNode.next = head;
				head = newNode;
			}
		}

		return head;
	}

	public static Node removeNthFromEnd(Node head, int n) {
		if (head == null || n < 0) {
			return head;
		}
		Node temp = head;
		int num = 1;
		while (temp != null) {
			temp = temp.next;
			num++;
		}
		num = num - n - 1;
		if (num == 0) {
			head = head.next;
			return head;
		}
		Node prev = head;
		Node temp2 = prev.next;
		while (temp2 != null) {
			num--;
			if (num == 0) {
				prev.next = temp2.next;
				return head;
			}
			prev = prev.next;
			temp2 = temp2.next;

		}
		return head;
	}

//	public static Node removeNthFromEnd(Node head, int n) {
//		n--;
//		
//		Node reversed = insert(head);
//		if(n==0) {
//			reversed = reversed.next;
//			return insert(reversed);
//		}
//		Node prev = reversed;
//		Node temp = prev.next;
//		
//		while(temp!=null){
//			n--;
//			if(n==0){
//				prev.next = temp.next;
//				break;
//			}
//			prev = prev.next;
//			temp = temp.next;
//		}
//		return insert(reversed);
//	}
	public static Node reorderList(Node temp) {
		SinglyLinkedList obj = new SinglyLinkedList();
		Node l1 = temp;
		Node l2 = null;
		obj.traversal(l1);

		while (l1 != null) {
			Node newNode = new Node(l1.data);
			if (l2 == null) {
				l2 = newNode;
			} else {
				newNode.next = l2;
				l2 = newNode;
			}
			l1 = l1.next;
		}
		int count = 0;
		Node head = temp;
		while (l2 != null) {
			count++;
			Node newNode = null;
			if (count % 2 == 1) {
				newNode = new Node(l1.data);
				l1 = l1.next.next;
			} else {
				l2 = l2.next;
				newNode = new Node(l2.data);
				l2 = l2.next;
			}
			if (head == null) {
				head = newNode;
			} else {
				newNode.next = head;
				head = newNode;
			}

		}
		return head;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2 };
		SinglyLinkedList linkedList1 = new SinglyLinkedList();
		linkedList1.insert(arr1);
		linkedList1.traversal();
		linkedList1.traversal(reorderList(linkedList1.head));
		
//		
//		Node result = removeNthFromEnd(linkedList1.head, 1);
//		linkedList1.traversal(result);

//		SinglyLinkedList linkedList2= new SinglyLinkedList();
//		linkedList2.insert(arr2);
////		
//		SinglyLinkedList result = multiplyLinkedLists(linkedList1.head, linkedList2.head);
//		result.traversal();

	}

}
