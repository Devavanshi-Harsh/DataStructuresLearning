package linked_list;

public class TestClass {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 9, 3, 4, 77, 5, 6, 6, 7, 10, 8 };
		DoublyLinkedList linkedList = new DoublyLinkedList();
		DoublyLinkedList linkedList1 = new DoublyLinkedList();
		linkedList.insert(arr);
		linkedList.traversal();
		linkedList.traversalReverse();
		linkedList.delete(1);
		linkedList.traversal();
		linkedList.search(2);
		System.out.println("****************");

		linkedList1.insertReverse(arr);
		linkedList1.traversal();
		System.out.println("****************");

//		CircularLinkedList linkedList = new CircularLinkedList();
//		CircularLinkedList linkedList1 = new CircularLinkedList();
//		linkedList.insert(arr);
//		linkedList.traverse();
//
//		linkedList1.insertReverse(arr);
//		linkedList1.traverse();
//		System.out.println("******************");
//		linkedList.search(1);
//		linkedList.delete(1);
//		linkedList.traverse();
//		System.out.println("******************");
//		linkedList.search(10);
//
//		SinglyLinkedList singly_Linked_List = new SinglyLinkedList();
//		//insert array in singly linked list.
//		singly_Linked_List.insert(arr);
//		//traversal function
//		System.out.print("Current List : ");
//		singly_Linked_List.traversal();
//		singly_Linked_List.reverse();
//		System.out.print("Reversed List: ");
//		singly_Linked_List.traversal();
//		singly_Linked_List.removeNthFromEnd(4);
//		System.out.print("Nth removed at the end of the List: ");
//		singly_Linked_List.traversal();
//		//search function
//		int searchElement = 100;
//		System.out.printf("Search check %d is present : ", searchElement);
//		boolean result = singly_Linked_List.search(searchElement);
//		System.out.println(result);
//		//delete function
//		System.out.print("delete 2 : ");
//		singly_Linked_List.delete(2);
//		singly_Linked_List.traversal();
	}
}
