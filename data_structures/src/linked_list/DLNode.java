package linked_list;

public class DLNode {
	public DLNode next;
	public DLNode prev;
	public int data;
	public DLNode(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
		
	}
}
